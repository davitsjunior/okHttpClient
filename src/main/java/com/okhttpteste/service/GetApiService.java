package com.okhttpteste.service;

import com.okhttpteste.gateway.impl.GetApiImpl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetApiService {

    @Autowired
    GetApiImpl getApi;

    public Response getApi() throws IOException {

        Request request = new Request.Builder()
                .url("https://api.adviceslip.com/advice")
                .method("GET",null)
                .build();

        return getApi.getApi(request);
    }
}
