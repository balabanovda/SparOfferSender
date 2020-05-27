package com.sas.spar.web.controller;

import com.sas.spar.service.SendService;
import com.sas.spar.web.model.Meta;
import com.sas.spar.web.model.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/send")
@Api(tags = "Методы для отправки акций")
public class SendController {
    @Autowired
    SendService sendService;

    @GetMapping("offer")
    @ApiOperation(value = "Отправка акции",
            notes = "Что-то в будущем, описывающее функционал метода")
    public ResponseEntity sendOffer() {
        return new ResponseEntity(new Response(new Meta(0, "Success"), null), HttpStatus.OK);
    }

    @GetMapping("/health-check")
    @ApiOperation(value = "Проверка доступности приложения")
    public ResponseEntity healthCheck() {
        return new ResponseEntity(new Response(new Meta(0, "Success"), null), HttpStatus.OK);
    }
}
