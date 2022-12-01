package com.okhttpteste.gateway.http;

import com.okhttpteste.service.OkHttpApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class OkHttpClientApiController {

    @Autowired
    private OkHttpApiService okHttpApiService;

    @PutMapping("/api/{id}")
    public Object putApiController(@PathVariable Integer id, @RequestBody String produto) throws Exception {

        return okHttpApiService.putApi(id, produto);
    }

    @PostMapping("/api")
    public Object postApiController(@RequestBody String produto) throws IOException{

        return okHttpApiService.postApi(produto);
    }

}
