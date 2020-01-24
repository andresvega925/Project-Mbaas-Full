package com.davivienda.api.model;



import com.davivienda.api.schemas.bancocoquimbo.CreateUserRq;
import java.io.Serializable;

public class PayloadCreationsUsersModel implements Serializable {
    private static final long serialVersionUID = 2L;
    private CreateUserRq service;
    
    
	public CreateUserRq getService() {
		return service;
	}
	public void setService(CreateUserRq service) {
		this.service = service;
	}
 



}
