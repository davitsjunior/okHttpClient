package com.okhttpteste.gateway.impl;

import com.okhttpteste.adapter.PostCallGeneration;
import com.okhttpteste.adapter.PutCallGeneration;
import com.okhttpteste.exceptionhandler.ConnectRefusedException;
import com.okhttpteste.exceptionhandler.ProductNotFoundException;
import com.okhttpteste.gateway.OkHttpApi;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.ConnectException;

@Service
public class OkHttpApiImpl implements OkHttpApi {
    @Override
    public Object putApi(Request req) throws Exception {
        try (Response response = PutCallGeneration.putCallMount(req)) {
            if (!response.isSuccessful())throw new ProductNotFoundException();
            return response.body();
        }catch (ConnectException e){
            throw new ConnectRefusedException();
        }
    }

    @Override
    public Object postApi(Request req) throws IOException {
        try (Response response = PostCallGeneration.postCallMount(req)) {
            if (!response.isSuccessful()) throw new IOException("Código inexperado...: " + "response");
            return response.body();
        }catch (ConnectException e){
            throw new ConnectRefusedException();
        }
    }
}
