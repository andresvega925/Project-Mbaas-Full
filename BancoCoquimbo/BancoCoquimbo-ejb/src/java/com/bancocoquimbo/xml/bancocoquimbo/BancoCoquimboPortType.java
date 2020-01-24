
package com.bancocoquimbo.xml.bancocoquimbo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BancoCoquimbo_portType", targetNamespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BancoCoquimboPortType {


    /**
     * 
     * @param request
     * @return
     *     returns com.bancocoquimbo.xml.bancocoquimbo.CreateUserRes
     */
    @WebMethod(operationName = "OpCreateUser")
    @WebResult(name = "CreateUserResponse", targetNamespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo", partName = "response")
    public CreateUserRes opCreateUser(
        @WebParam(name = "CreateUserRequest", targetNamespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo", partName = "request")
        CreateUserRq request);

}