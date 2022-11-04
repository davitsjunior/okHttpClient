package com.okhttpteste.gateway;

import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public interface GetApi {

    public Response getApi(Request request) throws IOException;
}
