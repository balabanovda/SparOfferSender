package com.sas.spar.web.controller;

import com.sas.spar.service.SendService;
import com.sas.spar.web.model.Meta;
import com.sas.spar.web.model.Response;
import com.sas.spar.web.model.dto.Root;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    public ResponseEntity post(@RequestBody Root root){
        System.out.println(root);
        sendService.saveRoot(root);
        return new ResponseEntity(new Response(new Meta(0, "Success"), null), HttpStatus.OK);
    }
}
