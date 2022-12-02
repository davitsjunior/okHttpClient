package com.okhttpteste.adapter;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class PutCallGeneration {

    private PutCallGeneration(){}

    public static Response putCallMount(Request request) throws IOException {
        return new PutCallGeneration().createCall(request);
    }

    public Response createCall(Request req) throws IOException {
        OkHttpClient client = new OkHttpClient();

        if (req.body() == null) throw new AssertionError();

        Request request = new Request.Builder()
                .url(req.url())
                .post(req.body())
                .build();
       return client.newCall(request).execute();
    }
}
