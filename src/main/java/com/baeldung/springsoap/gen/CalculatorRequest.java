//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.26 at 08:00:12 PM ICT 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "number1",
    "number2",
    "operator"
})
@XmlRootElement(name = "calculatorRequest")
public class CalculatorRequest {

    protected float number1;
    protected float number2;
    @XmlElement(required = true)
    protected String operator;

    /**
     * Gets the value of the number1 property.
     * 
     */
    public float getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(float value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     */
    public float getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     */
    public void setNumber2(float value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}