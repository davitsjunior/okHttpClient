package com.okhttpteste.exceptionhandler;

import java.util.Date;

public class MessageExceptionHandler {

    private Date timeStamp;
    private Integer status;
    private String mensage;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public MessageExceptionHandler(Date timeStamp, Integer status, String mensage) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.mensage = mensage;
    }
}
