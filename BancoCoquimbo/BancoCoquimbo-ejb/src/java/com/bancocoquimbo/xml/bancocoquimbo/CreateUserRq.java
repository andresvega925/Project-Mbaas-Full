
package com.bancocoquimbo.xml.bancocoquimbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUserRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUserRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lasta_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserRq", propOrder = {
    "name",
    "lastaName",
    "age",
    "phone",
    "dni"
})
public class CreateUserRq {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "lasta_name", required = true)
    protected String lastaName;
    protected int age;
    protected int phone;
    protected int dni;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lastaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastaName() {
        return lastaName;
    }

    /**
     * Sets the value of the lastaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastaName(String value) {
        this.lastaName = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     */
    public void setPhone(int value) {
        this.phone = value;
    }

    /**
     * Gets the value of the dni property.
     * 
     */
    public int getDni() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     * 
     */
    public void setDni(int value) {
        this.dni = value;
    }

}
