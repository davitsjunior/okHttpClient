package com.okhttpteste.gateway;

import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public interface OkHttpApi {

    public Response getApi(Request request) throws IOException;

    public Response putApi(Request request) throws IOException;

    public Response postApi(Request request) throws IOException;
}
