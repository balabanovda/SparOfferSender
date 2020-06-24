package com.sas.spar.service.impl;

import com.example.demo.restclient.ApiClient;
import com.example.demo.restclient.api.OfferImportExportApi;
import com.example.demo.restclient.auth.HttpBasicAuth;
import com.example.demo.restclient.model.OfferDto;
import com.example.demo.restclient.model.OffersImportModel;
import com.sas.spar.dao.*;
import com.sas.spar.mapper.RootMapper;
import com.sas.spar.repository.RootRepository;
import com.sas.spar.service.SendService;
import com.sas.spar.web.model.dto.Offers;
import com.sas.spar.web.model.dto.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import java.nio.charset.StandardCharsets;
import java.util.*;

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
//        System.out.println(root);
//        RootDAO rootDAO = RootMapper.ROOT_MAPPER.rootToRootDAO(root);
//        //   List<OffersDAO> offersDAOList = RootMapper.ROOT_MAPPER.offersListToOffersDAOList(root.getOffers(), root.getOffers().get(0).getPartners().getPartner());
//        // List<PartnerDAO> partnerDAOList = RootMapper.ROOT_MAPPER.partnerListToPartnerDAOList(root.getOffers().get(0).getPartners().getPartner());
////    OffersDAO offersDAO = RootMapper.ROOT_MAPPER.offersToOffersDAO(root.getOffers().get(0),root.getOffers().get(0).getPartners());
//        System.out.println(rootDAO);
////        System.out.println(offersDAOList);
//        for (OffersDAO offersDAO : rootDAO.getOffersList()) {
//            offersDAO.setRootDAO(rootDAO);
//            offersDAO.getPartnersDAO().setOffersDAO(offersDAO);
//            offersDAO.getRulesDAO().setOffersDAO(offersDAO);
//            for (PartnerDAO partnerDAO : offersDAO.getPartnersDAO().partnerDAOList) {
//                partnerDAO.setPartnersDAO(offersDAO.getPartnersDAO());
//            }
//
//            for (EventsDAO eventsDAO : offersDAO.getRulesDAO().getEventsDAOList()) {
//                eventsDAO.setRulesDAO(offersDAO.getRulesDAO());
//                for (ChainsDAO chainsDAO : eventsDAO.getChainsDAOList()) {
//                    chainsDAO.setEventsDAO(eventsDAO);
//                    for(FiltersDAO filtersDAO: chainsDAO.getFiltersList()){
//                        filtersDAO.setChainsDAO(chainsDAO);
//                    }
//                    for(ActionsDAO actionsDAO : chainsDAO.getActionsList()){
//                        actionsDAO.setChainsDAO(chainsDAO);
////                        for(CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesDAO : actionsDAO.getCalculationExclusionDiscountTypesList()){
////                            calculationExclusionDiscountTypesDAO.setActionsDAO(actionsDAO);
////                        }
//                    }
//                }
//            }
//        }
////        System.out.println(offersDAOList.get(0).getRootDAO());
//        rootRepository.save(rootDAO);
//
//        System.out.println(rootRepository.findById(1L));
//
//        RootDAO rootDAO1 = rootRepository.findById(1L).get();
//        Root root1 = RootMapper.ROOT_MAPPER.rootDAOToRoot(rootDAO1);
//        System.out.println(root1);
//        HttpHeaders headers = new HttpHeaders();
//
//        headers.setContentType(org.springframework.http.MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED));
//        headers.add("username","userSaS" );
//        headers.add("password","123456" );
//        HttpEntity<Root> requestBody = new HttpEntity<>(root1, headers);
//
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.postForEntity("https://sparmv-stg.loymax.tech/systemapi/api/Offers/Import", requestBody, Root.class);

        OfferDto offerDto = new OfferDto();
        offerDto.setId("dfc9287c-67cc-4254-8ee1-c974erf42rt9");
        OffersImportModel offersImportModel = new OffersImportModel();
        List<OfferDto> offersList = new ArrayList<>();
        offersList.add(offerDto);
//        HttpBasicAuth httpBasicAuth = new HttpBasicAuth();
//        httpBasicAuth.setUsername("userSaS");
//        httpBasicAuth.setPassword("123456");
//        String str = "userSaS" + ":" + "123456";
//        HttpHeaders headerParams = new HttpHeaders();
//        headerParams.add(HttpHeaders.AUTHORIZATION, "Basic " + Base64Utils.encodeToString(str.getBytes(StandardCharsets.UTF_8)));
        offersImportModel.setOffers(offersList);
        offersImportModel.setVersion(OffersImportModel.VersionEnum.VERSION20);
//        OfferImportExportApi offerImportExportApi = new OfferImportExportApi();
//        offerImportExportApi.offerImportExportPostOffersWithHttpInfo(headerParams,offersImportModel, true);


        ApiClient apiClient = new ApiClient();
        System.out.println(apiClient.getAuthentications());
       //
        // System.out.println( apiClient.getAuthentication("OAuth2Password"));
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
//        queryParams.add("username","userSaS");
//        queryParams.add("password","123456");
        HttpHeaders headerParams = new HttpHeaders();
        headerParams.add("username","userSaS");
        headerParams.add("password","123456");
        String[] s = new String[1];

        s[0] = "OAuth2Password";

        
        apiClient.invokeAPI("/api/Offers/Import",HttpMethod.POST,null,offersImportModel, headerParams,null,null, MediaType.APPLICATION_JSON,s, new ParameterizedTypeReference<List<String>>(){});


    }


}
