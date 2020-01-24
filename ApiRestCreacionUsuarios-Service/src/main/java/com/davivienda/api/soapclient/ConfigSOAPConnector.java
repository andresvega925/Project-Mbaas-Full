package com.davivienda.api.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfigSOAPConnector {

    @Bean
    public Jaxb2Marshaller marshallerCreationsUsers() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.davivienda.api.schemas.bancocoquimbo");
        return marshaller;
    }
  
  
  @Bean
  public SOAPConnectorCreationsUsers soapConnectorCreationsUsers(Jaxb2Marshaller marshallerCreationsUsers) throws Exception {
	  SOAPConnectorCreationsUsers client = new SOAPConnectorCreationsUsers();
    client.setDefaultUri("http://localhost:4020/");
    client.setMarshaller(marshallerCreationsUsers);
    client.setUnmarshaller(marshallerCreationsUsers);    
    return client;
  }

}


