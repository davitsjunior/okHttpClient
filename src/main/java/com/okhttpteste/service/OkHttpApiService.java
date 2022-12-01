package com.okhttpteste.service;

import com.okhttpteste.gateway.impl.OkHttpApiImpl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkHttpApiService {

    public static final String POST_PRODUTOS = "http://localhost:8080/api/produtos/api";
    public static final String PUT_PRODUTOS = "http://localhost:8080/api/produtos/";
    @Autowired
    OkHttpApiImpl okHttpApi;

    public Object putApi(Integer id, String produto) throws Exception {

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),produto);

        Request request = new Request.Builder()
                .url(PUT_PRODUTOS + id)
                .put(body)
                .build();

        return okHttpApi.putApi(request);
    }

    public Object postApi(String produto) throws IOException{

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),produto);

        Request request = new Request.Builder()
                .url(POST_PRODUTOS)
                .post(body)
                .build();

        return okHttpApi.postApi(request);
    }
}
