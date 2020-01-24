
package com.bancocoquimbo.xml.bancocoquimbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUserRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUserRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caracterAceptacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserRes", propOrder = {
    "response",
    "caracterAceptacion"
})
public class CreateUserRes {

    protected int response;
    @XmlElement(required = true)
    protected String caracterAceptacion;

    /**
     * Gets the value of the response property.
     * 
     */
    public int getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     */
    public void setResponse(int value) {
        this.response = value;
    }

    /**
     * Gets the value of the caracterAceptacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracterAceptacion() {
        return caracterAceptacion;
    }

    /**
     * Sets the value of the caracterAceptacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracterAceptacion(String value) {
        this.caracterAceptacion = value;
    }

}
