package com.sas.spar.service.impl;

import com.example.demo.restclient.model.OffersImportModel;
import com.sas.spar.service.SendService;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    //TODO Надо сделать сущности DAO и посмотреть как маппером их красиво преобразовать

    @Override
    public void sendOffer() {
        System.out.println("Hi!");
        OffersImportModel offersImportModel = new OffersImportModel();
    }
}
