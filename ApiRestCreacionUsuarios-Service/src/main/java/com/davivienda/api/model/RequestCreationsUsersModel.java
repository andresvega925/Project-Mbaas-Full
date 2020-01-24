package com.davivienda.api.model;

import java.io.Serializable;

public class RequestCreationsUsersModel implements Serializable {
    private static final long serialVersionUID = 2L;
    private PayloadCreationsUsersModel payload;

    public PayloadCreationsUsersModel getPayload() {
        return payload;
    }

    public void setPayload(PayloadCreationsUsersModel payload) {
        this.payload = payload;
    }
}
