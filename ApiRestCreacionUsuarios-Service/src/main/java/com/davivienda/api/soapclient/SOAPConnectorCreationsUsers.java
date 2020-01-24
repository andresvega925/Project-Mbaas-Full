package com.davivienda.api.soapclient;


import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import com.davivienda.api.schemas.bancocoquimbo.CreateUserRes;



public class SOAPConnectorCreationsUsers extends WebServiceGatewaySupport {

    public CreateUserRes callWebService(String url, Object request) {

        JAXBElement<CreateUserRes> resOb =  (JAXBElement<CreateUserRes>) getWebServiceTemplate()
        .marshalSendAndReceive(url, request);
        return resOb.getValue();
    }


}