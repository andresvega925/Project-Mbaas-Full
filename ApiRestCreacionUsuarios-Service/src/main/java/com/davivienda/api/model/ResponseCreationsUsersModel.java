package com.davivienda.api.model;
import java.io.Serializable;

import com.davivienda.api.schemas.bancocoquimbo.CreateUserRes;

public class ResponseCreationsUsersModel implements Serializable {
    private static final long serialVersionUID = 2L;
    private CreateUserRes response;
    
	public CreateUserRes getResponse() {
		return response;
	}
	public void setResponse(CreateUserRes response) {
		this.response = response;
	}

}
