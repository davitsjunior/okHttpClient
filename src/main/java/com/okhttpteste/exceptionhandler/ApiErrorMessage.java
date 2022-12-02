package com.okhttpteste.exceptionhandler;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApiErrorMessage {

    private HttpStatus status;
    private List<String> errors;

    public ApiErrorMessage(HttpStatus status, List<String> errors){
        super();
        this.status =status;
        this.errors = errors;
    }

    public ApiErrorMessage(HttpStatus status, String error){
        super();
        this.status =status;
        this.errors = Collections.singletonList(error);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
