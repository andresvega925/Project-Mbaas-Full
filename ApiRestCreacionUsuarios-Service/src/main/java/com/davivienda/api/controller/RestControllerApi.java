//
// Copyright (C) 2019 - Banco Davivienda S.A. y sus filiales.
//
// Controlador Rest del Microservicio.
package com.davivienda.api.controller;


import com.davivienda.api.model.RequestCreationsUsersModel;
import com.davivienda.api.model.ResponseCreationsUsersModel;
import com.davivienda.api.schemas.bancocoquimbo.CreateUserRes;
import com.davivienda.api.soapclient.ConfigSOAPConnector;
import com.davivienda.api.soapclient.SOAPConnectorCreationsUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestControllerApi
{
    @Autowired
    private SOAPConnectorCreationsUsers soapConnectorCreationsUsers;
    
	private Logger logger = LoggerFactory.getLogger(RestControllerApi.class);
	 
    

    @Value("${url.service.creations.users}")
    private String URL_CREATIONS_USERS;
   
    @PostMapping(path = "/creations-users", produces = "application/json")
    public ResponseCreationsUsersModel consultaPrimaSeguro(@RequestBody RequestCreationsUsersModel request){
    	ResponseCreationsUsersModel response = new ResponseCreationsUsersModel();
        if(request.getPayload() == null){
         
        }else{
            try{
            	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSOAPConnector.class);
            	soapConnectorCreationsUsers = context.getBean(SOAPConnectorCreationsUsers.class);
                logger.debug("URL a consumir informacion: {}"+URL_CREATIONS_USERS);                
                CreateUserRes responseServ =  soapConnectorCreationsUsers.callWebService(URL_CREATIONS_USERS, request.getPayload().getService());                
                response.setResponse(responseServ);
                logger.debug("CreationsUsers [POST] invocacion a  CreationsUsers  exitosa: " + URL_CREATIONS_USERS);            
                logger.debug("CreationsUsers [POST] ejecutado correctamente");
            }catch(Exception e){
            	e.printStackTrace();
                
            }
        }
     
        return response;
    }

}