package com.okhttpteste.gateway.impl;

import com.okhttpteste.exceptionhandler.ConnectRefusedException;
import com.okhttpteste.exceptionhandler.ProductNotFoundException;
import com.okhttpteste.gateway.OkHttpApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.util.concurrent.TimeUnit;

@Service
public class OkHttpApiImpl implements OkHttpApi {
    @Override
    public Object putApi(Request req) throws Exception {
        final OkHttpClient client = new OkHttpClient().newBuilder()
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .writeTimeout(5, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.SECONDS)
                .build();

        assert req.body() != null;
        Request request = new Request.Builder()
                    .url(req.url())
                    .put(req.body())
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful())throw new ProductNotFoundException();

            return response.body();

        }catch (ConnectException e){
            throw new ConnectRefusedException();
        }
    }

    @Override
    public Object postApi(Request req) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        assert req.body() != null;

        Request request = new Request.Builder()
                .url(req.url())
                .post(req.body())
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Código inexperado...: " + "response");
            return response.body();
        }catch (ConnectException e){
            throw new ConnectRefusedException();
        }
    }
}
