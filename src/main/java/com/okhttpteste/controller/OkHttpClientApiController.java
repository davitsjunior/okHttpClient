package com.okhttpteste.controller;

import com.okhttpteste.service.OkHttpApiService;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class OkHttpClientApiController {

    @Autowired
    private OkHttpApiService okHttpApiService;

    @GetMapping("/api")
    public Response getApiController() throws IOException{

        return okHttpApiService.getApi();

    }

    @PutMapping("/api/{id}")
    public Response putApiController(@PathVariable Integer id, @RequestBody String produto) throws IOException{

        return okHttpApiService.putApi(id, produto);
    }

    @PostMapping("/api")
    public Response postApiController(@RequestBody String produto) throws IOException{

        return okHttpApiService.postApi(produto);
    }

}
