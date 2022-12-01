package com.okhttpteste.gateway;

import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public interface OkHttpApi {

    public Object putApi(Request request) throws Exception;

    public Object postApi(Request request) throws IOException;
}
