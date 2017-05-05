/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.18 at 11:10:55 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetBIOS" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimReference"/>
 *         &lt;element name="Offset" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimUnsignedInt"/>
 *         &lt;element name="NumberOfBytes" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimUnsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "targetBIOS", "offset", "numberOfBytes" })
@XmlRootElement(name = "ReadRawBIOSData_INPUT")
public class ReadRawBIOSDataINPUT {

    @XmlElement(name = "TargetBIOS", required = true, nillable = true)
    protected CimReference targetBIOS;
    @XmlElement(name = "Offset", required = true)
    protected CimUnsignedInt offset;
    @XmlElement(name = "NumberOfBytes", required = true)
    protected CimUnsignedInt numberOfBytes;


    /**
     * Gets the value of the targetBIOS property.
     * 
     * @return possible object is {@link CimReference }
     * 
     */
    public CimReference getTargetBIOS() {
        return targetBIOS;
    }


    /**
     * Sets the value of the targetBIOS property.
     * 
     * @param value allowed object is {@link CimReference }
     * 
     */
    public void setTargetBIOS(CimReference value) {
        this.targetBIOS = value;
    }


    /**
     * Gets the value of the offset property.
     * 
     * @return possible object is {@link CimUnsignedInt }
     * 
     */
    public CimUnsignedInt getOffset() {
        return offset;
    }


    /**
     * Sets the value of the offset property.
     * 
     * @param value allowed object is {@link CimUnsignedInt }
     * 
     */
    public void setOffset(CimUnsignedInt value) {
        this.offset = value;
    }


    /**
     * Gets the value of the numberOfBytes property.
     * 
     * @return possible object is {@link CimUnsignedInt }
     * 
     */
    public CimUnsignedInt getNumberOfBytes() {
        return numberOfBytes;
    }


    /**
     * Sets the value of the numberOfBytes property.
     * 
     * @param value allowed object is {@link CimUnsignedInt }
     * 
     */
    public void setNumberOfBytes(CimUnsignedInt value) {
        this.numberOfBytes = value;
    }

}