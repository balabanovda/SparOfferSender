package com.sas.spar.service.impl;

import com.example.demo.restclient.model.OffersImportModel;
import com.sas.spar.dao.*;
import com.sas.spar.mapper.RootMapper;
import com.sas.spar.repository.RootRepository;
import com.sas.spar.service.SendService;
import com.sas.spar.web.model.dto.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Service
public class SendServiceImpl implements SendService {

    //TODO Надо сделать сущности DAO и посмотреть как маппером их красиво преобразовать
    // static final Logger loggerApp = LoggerFactory.getLogger("App_log");
    @Autowired
    private RootRepository rootRepository;

    @Override
    public void sendOffer() {
        System.out.println("Hi!");
        OffersImportModel offersImportModel = new OffersImportModel();
        RestTemplate restTemplate = new RestTemplate();
    }

    @Override
    public void saveRoot(Root root) {
        System.out.println(root);
        RootDAO rootDAO = RootMapper.ROOT_MAPPER.rootToRootDAO(root);
        //   List<OffersDAO> offersDAOList = RootMapper.ROOT_MAPPER.offersListToOffersDAOList(root.getOffers(), root.getOffers().get(0).getPartners().getPartner());
        // List<PartnerDAO> partnerDAOList = RootMapper.ROOT_MAPPER.partnerListToPartnerDAOList(root.getOffers().get(0).getPartners().getPartner());
//    OffersDAO offersDAO = RootMapper.ROOT_MAPPER.offersToOffersDAO(root.getOffers().get(0),root.getOffers().get(0).getPartners());
        System.out.println(rootDAO);
//        System.out.println(offersDAOList);
        for (OffersDAO offersDAO : rootDAO.getOffersList()) {
            offersDAO.setRootDAO(rootDAO);
            offersDAO.getPartnersDAO().setOffersDAO(offersDAO);
            offersDAO.getRulesDAO().setOffersDAO(offersDAO);
            for (PartnerDAO partnerDAO : offersDAO.getPartnersDAO().partnerDAOList) {
                partnerDAO.setPartnersDAO(offersDAO.getPartnersDAO());
            }

            for (EventsDAO eventsDAO : offersDAO.getRulesDAO().getEventsDAOList()) {
                eventsDAO.setRulesDAO(offersDAO.getRulesDAO());
                for (ChainsDAO chainsDAO : eventsDAO.getChainsDAOList()) {
                    chainsDAO.setEventsDAO(eventsDAO);
                    for(FiltersDAO filtersDAO: chainsDAO.getFiltersList()){
                        filtersDAO.setChainsDAO(chainsDAO);
                    }
                    for(ActionsDAO actionsDAO : chainsDAO.getActionsList()){
                        actionsDAO.setChainsDAO(chainsDAO);
//                        for(CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesDAO : actionsDAO.getCalculationExclusionDiscountTypesList()){
//                            calculationExclusionDiscountTypesDAO.setActionsDAO(actionsDAO);
//                        }
                    }
                }
            }
        }
//        System.out.println(offersDAOList.get(0).getRootDAO());
        rootRepository.save(rootDAO);

        System.out.println(rootRepository.findById(1L));

        RootDAO rootDAO1 = rootRepository.findById(1L).get();
        Root root1 = RootMapper.ROOT_MAPPER.rootDAOToRoot(rootDAO1);
        System.out.println(root1);
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(org.springframework.http.MediaType.valueOf(MediaType.APPLICATION_JSON));
        HttpEntity<Root> requestBody = new HttpEntity<>(root1, headers);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity("http://localhost:9090/post", requestBody, Root.class);
    }


}
