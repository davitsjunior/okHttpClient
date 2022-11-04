package com.okhttpteste.service;

import com.okhttpteste.gateway.impl.OkHttpApiImpl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkHttpApiService {

    @Autowired
    OkHttpApiImpl okHttpApi;

    public Response getApi() throws IOException {

        Request request = new Request.Builder()
                .url("https://api.adviceslip.com/advice")
                .method("GET",null)
                .build();

        return okHttpApi.getApi(request);
    }

    public Response putApi(Integer id, String produto) throws IOException{

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),produto);

        Request request = new Request.Builder()
                .url("http://localhost:8080/api/produtos/" + id)
                .put(body)
                .build();

        return okHttpApi.putApi(request);
    }

    public Response postApi(String produto) throws IOException{

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),produto);

        Request request = new Request.Builder()
                .url("http://localhost:8080/api/produtos/api")
                .post(body)
                .build();

        return okHttpApi.postApi(request);
    }
}
