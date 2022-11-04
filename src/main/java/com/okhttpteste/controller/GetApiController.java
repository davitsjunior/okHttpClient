package com.okhttpteste.controller;

import com.okhttpteste.service.GetApiService;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GetApiController {

    @Autowired
    private GetApiService getApiService;

    @GetMapping("/api")
    public String getApiController() throws IOException{

        Response response = getApiService.getApi();

        return response.getClass().toString();
    }
}
