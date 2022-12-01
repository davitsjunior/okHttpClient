package com.okhttpteste.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;

@ControllerAdvice(basePackages = "com.okhttpteste.gateway.http")
public class ConnectControllerAdvice {
    @ResponseBody
    @ExceptionHandler(ConnectRefusedException.class)
    public ResponseEntity<MessageExceptionHandler> erroConnect(ConnectRefusedException erroConnect){
        MessageExceptionHandler error = new MessageExceptionHandler(
                new Date(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Problema na conexão com o serviço"
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
