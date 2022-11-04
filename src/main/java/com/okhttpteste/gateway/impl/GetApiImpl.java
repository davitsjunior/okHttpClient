package com.okhttpteste.gateway.impl;

import com.okhttpteste.gateway.GetApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetApiImpl implements GetApi {
    @Override
    public Response getApi(Request req) throws IOException {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient().newBuilder()
                .addInterceptor(logging)
                .build();

        Request request = new Request.Builder()
                .url(req.url())
                .method(req.method(), null)
                .build();

        Response response = client.newCall(request).execute();

        return response;


    }
}
