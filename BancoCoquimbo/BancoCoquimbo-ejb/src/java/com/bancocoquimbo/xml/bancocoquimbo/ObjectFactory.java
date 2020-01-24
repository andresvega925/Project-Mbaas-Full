
package com.bancocoquimbo.xml.bancocoquimbo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancocoquimbo.xml.bancocoquimbo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateUserRequest_QNAME = new QName("http://www.bancocoquimbo.com/xml/BancoCoquimbo", "CreateUserRequest");
    private final static QName _CreateUserResponse_QNAME = new QName("http://www.bancocoquimbo.com/xml/BancoCoquimbo", "CreateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancocoquimbo.xml.bancocoquimbo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateUserRes }
     * 
     */
    public CreateUserRes createCreateUserRes() {
        return new CreateUserRes();
    }

    /**
     * Create an instance of {@link CreateUserRq }
     * 
     */
    public CreateUserRq createCreateUserRq() {
        return new CreateUserRq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserRq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo", name = "CreateUserRequest")
    public JAXBElement<CreateUserRq> createCreateUserRequest(CreateUserRq value) {
        return new JAXBElement<CreateUserRq>(_CreateUserRequest_QNAME, CreateUserRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bancocoquimbo.com/xml/BancoCoquimbo", name = "CreateUserResponse")
    public JAXBElement<CreateUserRes> createCreateUserResponse(CreateUserRes value) {
        return new JAXBElement<CreateUserRes>(_CreateUserResponse_QNAME, CreateUserRes.class, null, value);
    }

}
