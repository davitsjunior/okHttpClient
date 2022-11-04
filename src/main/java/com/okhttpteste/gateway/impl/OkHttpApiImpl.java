package com.okhttpteste.gateway.impl;

import com.okhttpteste.gateway.OkHttpApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkHttpApiImpl implements OkHttpApi {
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

        return client.newCall(request).execute();

    }

    @Override
    public Response putApi(Request req) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        assert req.body() != null;
        Request request = new Request.Builder()
                .url(req.url())
                .put(req.body())
                .build();

        return client.newCall(request).execute();
    }

    @Override
    public Response postApi(Request req) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        assert req.body() != null;
        Request request = new Request.Builder()
                .url(req.url())
                .post(req.body())
                .build();

        return client.newCall(request).execute();

    }
}
