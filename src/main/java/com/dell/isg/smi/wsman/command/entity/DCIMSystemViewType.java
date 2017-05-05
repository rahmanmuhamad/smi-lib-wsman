/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.19 at 04:19:40 PM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for DCIM_SystemView_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCIM_SystemView_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}AssetTag" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BIOSReleaseDate" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BIOSVersionString" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BaseBoardChassisSlot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BoardPartNumber" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BoardSerialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}CMCIP" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BladeGeometry" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}CPLDVersion" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}CPURollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}Caption" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ChassisName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ChassisServiceTag" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ChassisSystemHeight" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ExpressServiceCode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}Description" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ElementName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}FQDD" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}FanRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}BatteryRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}Generation" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}HostName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}LastSystemInventoryTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}LastUpdateTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}LicensingRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}LifecycleControllerVersion" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}Manufacturer" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}MaxCPUSockets" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}MaxDIMMSlots" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}MaxPCIeSlots" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}MemoryOperationMode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}Model" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PSRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PlatformGUID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PopulatedCPUSockets" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PopulatedDIMMSlots" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PopulatedPCIeSlots" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PowerCap" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PowerCapEnabledState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PowerState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}PrimaryStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}RollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}ServiceTag" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}StorageRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemErrorInfo" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemErrorMethodology" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemFailOverState" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemLocation" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemPrimaryStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SysMemTotalSize" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SystemID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}SystemRevision" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}TempRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}UUID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}VoltRollupStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView}smbiosGUID" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCIM_SystemView_Type", namespace = "http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_SystemView", propOrder = { "assetTag", "biosReleaseDate", "biosVersionString", "baseBoardChassisSlot", "batteryRollupStatus", "bladeGeometry", "boardPartNumber", "boardSerialNumber", "cmcip", "cpldVersion", "cpuRollupStatus", "caption", "chassisModel", "chassisName", "chassisServiceTag", "chassisSystemHeight", "currentRollupStatus", "description", "deviceDescription", "elementName", "estimatedExhaustTemperature", "estimatedSystemAirflow", "expressServiceCode", "fqdd", "fanRollupStatus", "generation", "hostName", "idsdmRollupStatus", "instanceID", "intrusionRollupStatus", "lastSystemInventoryTime", "lastUpdateTime", "licensingRollupStatus", "lifecycleControllerVersion", "manufacturer", "maxCPUSockets", "maxDIMMSlots", "maxPCIeSlots", "memoryOperationMode", "memoryRollupStatus", "model", "nodeId", "psRollupStatus", "platformGUID", "populatedCPUSockets", "populatedDIMMSlots", "populatedPCIeSlots", "powerCap", "powerCapEnabledState", "powerState", "primaryStatus", "rollupStatus", "sdCardRollupStatus", "serverAllocation", "serviceTag", "storageRollupStatus", "sysMemErrorInfo", "sysMemErrorMethodology", "sysMemFailOverState", "sysMemLocation", "sysMemMaxCapacitySize", "sysMemPrimaryStatus", "sysMemTotalSize", "systemGeneration", "systemID", "systemRevision", "tempRollupStatus", "tempStatisticsRollupStatus", "uuid", "voltRollupStatus", "smbiosGUID", "any" })
public class DCIMSystemViewType {

    @XmlElement(name = "AssetTag", nillable = true)
    protected CimString assetTag;
    @XmlElement(name = "BIOSReleaseDate", nillable = true)
    protected CimString biosReleaseDate;
    @XmlElement(name = "BIOSVersionString", nillable = true)
    protected CimString biosVersionString;
    @XmlElement(name = "BaseBoardChassisSlot", nillable = true)
    protected CimString baseBoardChassisSlot;
    @XmlElement(name = "BoardPartNumber", nillable = true)
    protected CimString boardPartNumber;
    @XmlElement(name = "BoardSerialNumber", nillable = true)
    protected CimString boardSerialNumber;
    @XmlElement(name = "CMCIP", nillable = true)
    protected CimString cmcip;
    @XmlElement(name = "BladeGeometry", nillable = true)
    protected BladeGeometry bladeGeometry;
    @XmlElement(name = "CPLDVersion", nillable = true)
    protected CimString cpldVersion;
    @XmlElement(name = "CPURollupStatus", nillable = true)
    protected CPURollupStatus cpuRollupStatus;
    @XmlElement(name = "Caption", nillable = true)
    protected Caption caption;
    @XmlElement(name = "ChassisName", nillable = true)
    protected CimString chassisName;
    @XmlElement(name = "ChassisModel", nillable = true)
    protected CimString chassisModel;
    @XmlElement(name = "DeviceDescription", nillable = true)
    protected CimString deviceDescription;
    @XmlElement(name = "ChassisServiceTag", nillable = true)
    protected CimString chassisServiceTag;
    @XmlElement(name = "ChassisSystemHeight", nillable = true)
    protected CimUnsignedShort chassisSystemHeight;
    @XmlElement(name = "CurrentRollupStatus", nillable = true)
    protected CurrentRollupStatus currentRollupStatus;
    @XmlElement(name = "EstimatedSystemAirflow", nillable = true)
    protected CimUnsignedShort estimatedSystemAirflow;
    @XmlElement(name = "EstimatedExhaustTemperature", nillable = true)
    protected CimUnsignedShort estimatedExhaustTemperature;
    @XmlElement(name = "ExpressServiceCode", nillable = true)
    protected CimString expressServiceCode;
    @XmlElement(name = "Description", nillable = true)
    protected CimString description;
    @XmlElement(name = "ElementName", nillable = true)
    protected CimString elementName;
    @XmlElement(name = "FQDD", nillable = true)
    protected CimString fqdd;
    @XmlElement(name = "FanRollupStatus", nillable = true)
    protected FanRollupStatus fanRollupStatus;
    @XmlElement(name = "BatteryRollupStatus", nillable = true)
    protected BatteryRollupStatus batteryRollupStatus;
    @XmlElement(name = "Generation", nillable = true)
    protected CimUnsignedLong generation;
    @XmlElement(name = "HostName", nillable = true)
    protected CimString hostName;
    @XmlElement(name = "InstanceID", nillable = true)
    protected CimString instanceID;
    @XmlElement(name = "IDSDMRollupStatus", nillable = true)
    protected IDSDMRollupStatus idsdmRollupStatus;
    @XmlElement(name = "IntrusionRollupStatus", nillable = true)
    protected IntrusionRollupStatus intrusionRollupStatus;
    @XmlElement(name = "LastSystemInventoryTime", nillable = true)
    protected CimString lastSystemInventoryTime;
    @XmlElement(name = "LastUpdateTime", nillable = true)
    protected CimString lastUpdateTime;
    @XmlElement(name = "LicensingRollupStatus", nillable = true)
    protected LicensingRollupStatus licensingRollupStatus;
    @XmlElement(name = "LifecycleControllerVersion", nillable = true)
    protected CimString lifecycleControllerVersion;
    @XmlElement(name = "Manufacturer", nillable = true)
    protected CimString manufacturer;
    @XmlElement(name = "MaxCPUSockets", nillable = true)
    protected CimUnsignedInt maxCPUSockets;
    @XmlElement(name = "MaxDIMMSlots", nillable = true)
    protected CimUnsignedInt maxDIMMSlots;
    @XmlElement(name = "MaxPCIeSlots", nillable = true)
    protected CimUnsignedInt maxPCIeSlots;
    @XmlElement(name = "MemoryOperationMode", nillable = true)
    protected CimString memoryOperationMode;
    @XmlElement(name = "MemoryRollupStatus", nillable = true)
    protected MemoryRollupStatus memoryRollupStatus;
    @XmlElement(name = "Model", nillable = true)
    protected CimString model;
    @XmlElement(name = "NodeID", nillable = true)
    protected CimString nodeId;
    @XmlElement(name = "PSRollupStatus", nillable = true)
    protected PSRollupStatus psRollupStatus;
    @XmlElement(name = "PlatformGUID", nillable = true)
    protected CimString platformGUID;
    @XmlElement(name = "PopulatedCPUSockets", nillable = true)
    protected CimUnsignedInt populatedCPUSockets;
    @XmlElement(name = "PopulatedDIMMSlots", nillable = true)
    protected CimUnsignedInt populatedDIMMSlots;
    @XmlElement(name = "PopulatedPCIeSlots", nillable = true)
    protected CimUnsignedInt populatedPCIeSlots;
    @XmlElement(name = "PowerCap", nillable = true)
    protected CimUnsignedInt powerCap;
    @XmlElement(name = "PowerCapEnabledState", nillable = true)
    protected PowerCapEnabledState powerCapEnabledState;
    @XmlElement(name = "PowerState", nillable = true)
    protected PowerState powerState;
    @XmlElement(name = "PrimaryStatus", nillable = true)
    protected PrimaryStatus primaryStatus;
    @XmlElement(name = "SDCardRollupStatus", nillable = true)
    protected SDCardRollupStatus sdCardRollupStatus;
    @XmlElement(name = "RollupStatus", nillable = true)
    protected RollupStatus rollupStatus;
    @XmlElement(name = "ServerAllocation", nillable = true)
    protected CimUnsignedInt serverAllocation;
    @XmlElement(name = "ServiceTag", nillable = true)
    protected CimString serviceTag;
    @XmlElement(name = "StorageRollupStatus", nillable = true)
    protected StorageRollupStatus storageRollupStatus;
    @XmlElement(name = "SysMemErrorInfo", nillable = true)
    protected SysMemErrorInfo sysMemErrorInfo;
    @XmlElement(name = "SysMemErrorMethodology", nillable = true)
    protected SysMemErrorMethodology sysMemErrorMethodology;
    @XmlElement(name = "SysMemFailOverState", nillable = true)
    protected CimString sysMemFailOverState;
    @XmlElement(name = "SysMemLocation", nillable = true)
    protected SysMemLocation sysMemLocation;
    @XmlElement(name = "SysMemPrimaryStatus", nillable = true)
    protected SysMemPrimaryStatus sysMemPrimaryStatus;
    @XmlElement(name = "SysMemTotalSize", nillable = true)
    protected CimUnsignedInt sysMemTotalSize;
    @XmlElement(name = "SysMemMaxCapacitySize", nillable = true)
    protected CimUnsignedInt sysMemMaxCapacitySize;
    @XmlElement(name = "SystemGeneration", nillable = true)
    protected CimString systemGeneration;
    @XmlElement(name = "SystemID", nillable = true)
    protected CimUnsignedInt systemID;
    @XmlElement(name = "SystemRevision", nillable = true)
    protected SystemRevision systemRevision;
    @XmlElement(name = "TempRollupStatus", nillable = true)
    protected TempRollupStatus tempRollupStatus;
    @XmlElement(name = "TempStatisticsRollupStatus", nillable = true)
    protected TempStatisticsRollupStatus tempStatisticsRollupStatus;
    @XmlElement(name = "UUID", nillable = true)
    protected CimString uuid;
    @XmlElement(name = "VoltRollupStatus", nillable = true)
    protected VoltRollupStatus voltRollupStatus;
    @XmlElement(name = "smbiosGUID", nillable = true)
    protected CimString smbiosGUID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public CimString getAssetTag() {
        return assetTag;
    }


    public void setAssetTag(CimString assetTag) {
        this.assetTag = assetTag;
    }


    public CimString getBiosReleaseDate() {
        return biosReleaseDate;
    }


    public void setBiosReleaseDate(CimString biosReleaseDate) {
        this.biosReleaseDate = biosReleaseDate;
    }


    public CimString getBiosVersionString() {
        return biosVersionString;
    }


    public void setBiosVersionString(CimString biosVersionString) {
        this.biosVersionString = biosVersionString;
    }


    public CimString getBaseBoardChassisSlot() {
        return baseBoardChassisSlot;
    }


    public void setBaseBoardChassisSlot(CimString baseBoardChassisSlot) {
        this.baseBoardChassisSlot = baseBoardChassisSlot;
    }


    public CimString getBoardPartNumber() {
        return boardPartNumber;
    }


    public void setBoardPartNumber(CimString boardPartNumber) {
        this.boardPartNumber = boardPartNumber;
    }


    public CimString getBoardSerialNumber() {
        return boardSerialNumber;
    }


    public void setBoardSerialNumber(CimString boardSerialNumber) {
        this.boardSerialNumber = boardSerialNumber;
    }


    public CimString getCmcip() {
        return cmcip;
    }


    public void setCmcip(CimString cmcip) {
        this.cmcip = cmcip;
    }


    public BladeGeometry getBladeGeometry() {
        return bladeGeometry;
    }


    public void setBladeGeometry(BladeGeometry bladeGeometry) {
        this.bladeGeometry = bladeGeometry;
    }


    public CimString getCpldVersion() {
        return cpldVersion;
    }


    public void setCpldVersion(CimString cpldVersion) {
        this.cpldVersion = cpldVersion;
    }


    public CPURollupStatus getCpuRollupStatus() {
        return cpuRollupStatus;
    }


    public void setCpuRollupStatus(CPURollupStatus cpuRollupStatus) {
        this.cpuRollupStatus = cpuRollupStatus;
    }


    public Caption getCaption() {
        return caption;
    }


    public void setCaption(Caption caption) {
        this.caption = caption;
    }


    public CimString getChassisName() {
        return chassisName;
    }


    public void setChassisName(CimString chassisName) {
        this.chassisName = chassisName;
    }


    public CimString getChassisModel() {
        return chassisModel;
    }


    public void setChassisModel(CimString chassisModel) {
        this.chassisModel = chassisModel;
    }


    public CimString getDeviceDescription() {
        return deviceDescription;
    }


    public void setDeviceDescription(CimString deviceDescription) {
        this.deviceDescription = deviceDescription;
    }


    public CimString getChassisServiceTag() {
        return chassisServiceTag;
    }


    public void setChassisServiceTag(CimString chassisServiceTag) {
        this.chassisServiceTag = chassisServiceTag;
    }


    public CimUnsignedShort getChassisSystemHeight() {
        return chassisSystemHeight;
    }


    public void setChassisSystemHeight(CimUnsignedShort chassisSystemHeight) {
        this.chassisSystemHeight = chassisSystemHeight;
    }


    public CurrentRollupStatus getCurrentRollupStatus() {
        return currentRollupStatus;
    }


    public void setCurrentRollupStatus(CurrentRollupStatus currentRollupStatus) {
        this.currentRollupStatus = currentRollupStatus;
    }


    public CimUnsignedShort getEstimatedSystemAirflow() {
        return estimatedSystemAirflow;
    }


    public void setEstimatedSystemAirflow(CimUnsignedShort estimatedSystemAirflow) {
        this.estimatedSystemAirflow = estimatedSystemAirflow;
    }


    public CimUnsignedShort getEstimatedExhaustTemperature() {
        return estimatedExhaustTemperature;
    }


    public void setEstimatedExhaustTemperature(CimUnsignedShort estimatedExhaustTemperature) {
        this.estimatedExhaustTemperature = estimatedExhaustTemperature;
    }


    public CimString getExpressServiceCode() {
        return expressServiceCode;
    }


    public void setExpressServiceCode(CimString expressServiceCode) {
        this.expressServiceCode = expressServiceCode;
    }


    public CimString getDescription() {
        return description;
    }


    public void setDescription(CimString description) {
        this.description = description;
    }


    public CimString getElementName() {
        return elementName;
    }


    public void setElementName(CimString elementName) {
        this.elementName = elementName;
    }


    public CimString getFqdd() {
        return fqdd;
    }


    public void setFqdd(CimString fqdd) {
        this.fqdd = fqdd;
    }


    public FanRollupStatus getFanRollupStatus() {
        return fanRollupStatus;
    }


    public void setFanRollupStatus(FanRollupStatus fanRollupStatus) {
        this.fanRollupStatus = fanRollupStatus;
    }


    public BatteryRollupStatus getBatteryRollupStatus() {
        return batteryRollupStatus;
    }


    public void setBatteryRollupStatus(BatteryRollupStatus batteryRollupStatus) {
        this.batteryRollupStatus = batteryRollupStatus;
    }


    public CimUnsignedLong getGeneration() {
        return generation;
    }


    public void setGeneration(CimUnsignedLong generation) {
        this.generation = generation;
    }


    public CimString getHostName() {
        return hostName;
    }


    public void setHostName(CimString hostName) {
        this.hostName = hostName;
    }


    public CimString getInstanceID() {
        return instanceID;
    }


    public void setInstanceID(CimString instanceID) {
        this.instanceID = instanceID;
    }


    public IDSDMRollupStatus getIdsdmRollupStatus() {
        return idsdmRollupStatus;
    }


    public void setIdsdmRollupStatus(IDSDMRollupStatus idsdmRollupStatus) {
        this.idsdmRollupStatus = idsdmRollupStatus;
    }


    public IntrusionRollupStatus getIntrusionRollupStatus() {
        return intrusionRollupStatus;
    }


    public void setIntrusionRollupStatus(IntrusionRollupStatus intrusionRollupStatus) {
        this.intrusionRollupStatus = intrusionRollupStatus;
    }


    public CimString getLastSystemInventoryTime() {
        return lastSystemInventoryTime;
    }


    public void setLastSystemInventoryTime(CimString lastSystemInventoryTime) {
        this.lastSystemInventoryTime = lastSystemInventoryTime;
    }


    public CimString getLastUpdateTime() {
        return lastUpdateTime;
    }


    public void setLastUpdateTime(CimString lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    public LicensingRollupStatus getLicensingRollupStatus() {
        return licensingRollupStatus;
    }


    public void setLicensingRollupStatus(LicensingRollupStatus licensingRollupStatus) {
        this.licensingRollupStatus = licensingRollupStatus;
    }


    public CimString getLifecycleControllerVersion() {
        return lifecycleControllerVersion;
    }


    public void setLifecycleControllerVersion(CimString lifecycleControllerVersion) {
        this.lifecycleControllerVersion = lifecycleControllerVersion;
    }


    public CimString getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(CimString manufacturer) {
        this.manufacturer = manufacturer;
    }


    public CimUnsignedInt getMaxCPUSockets() {
        return maxCPUSockets;
    }


    public void setMaxCPUSockets(CimUnsignedInt maxCPUSockets) {
        this.maxCPUSockets = maxCPUSockets;
    }


    public CimUnsignedInt getMaxDIMMSlots() {
        return maxDIMMSlots;
    }


    public void setMaxDIMMSlots(CimUnsignedInt maxDIMMSlots) {
        this.maxDIMMSlots = maxDIMMSlots;
    }


    public CimUnsignedInt getMaxPCIeSlots() {
        return maxPCIeSlots;
    }


    public void setMaxPCIeSlots(CimUnsignedInt maxPCIeSlots) {
        this.maxPCIeSlots = maxPCIeSlots;
    }


    public CimString getMemoryOperationMode() {
        return memoryOperationMode;
    }


    public void setMemoryOperationMode(CimString memoryOperationMode) {
        this.memoryOperationMode = memoryOperationMode;
    }


    public MemoryRollupStatus getMemoryRollupStatus() {
        return memoryRollupStatus;
    }


    public void setMemoryRollupStatus(MemoryRollupStatus memoryRollupStatus) {
        this.memoryRollupStatus = memoryRollupStatus;
    }


    public CimString getModel() {
        return model;
    }


    public void setModel(CimString model) {
        this.model = model;
    }


    public CimString getNodeId() {
        return nodeId;
    }


    public void setNodeId(CimString nodeId) {
        this.nodeId = nodeId;
    }


    public PSRollupStatus getPsRollupStatus() {
        return psRollupStatus;
    }


    public void setPsRollupStatus(PSRollupStatus psRollupStatus) {
        this.psRollupStatus = psRollupStatus;
    }


    public CimString getPlatformGUID() {
        return platformGUID;
    }


    public void setPlatformGUID(CimString platformGUID) {
        this.platformGUID = platformGUID;
    }


    public CimUnsignedInt getPopulatedCPUSockets() {
        return populatedCPUSockets;
    }


    public void setPopulatedCPUSockets(CimUnsignedInt populatedCPUSockets) {
        this.populatedCPUSockets = populatedCPUSockets;
    }


    public CimUnsignedInt getPopulatedDIMMSlots() {
        return populatedDIMMSlots;
    }


    public void setPopulatedDIMMSlots(CimUnsignedInt populatedDIMMSlots) {
        this.populatedDIMMSlots = populatedDIMMSlots;
    }


    public CimUnsignedInt getPopulatedPCIeSlots() {
        return populatedPCIeSlots;
    }


    public void setPopulatedPCIeSlots(CimUnsignedInt populatedPCIeSlots) {
        this.populatedPCIeSlots = populatedPCIeSlots;
    }


    public CimUnsignedInt getPowerCap() {
        return powerCap;
    }


    public void setPowerCap(CimUnsignedInt powerCap) {
        this.powerCap = powerCap;
    }


    public PowerCapEnabledState getPowerCapEnabledState() {
        return powerCapEnabledState;
    }


    public void setPowerCapEnabledState(PowerCapEnabledState powerCapEnabledState) {
        this.powerCapEnabledState = powerCapEnabledState;
    }


    public PowerState getPowerState() {
        return powerState;
    }


    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }


    public PrimaryStatus getPrimaryStatus() {
        return primaryStatus;
    }


    public void setPrimaryStatus(PrimaryStatus primaryStatus) {
        this.primaryStatus = primaryStatus;
    }


    public SDCardRollupStatus getSdCardRollupStatus() {
        return sdCardRollupStatus;
    }


    public void setSdCardRollupStatus(SDCardRollupStatus sdCardRollupStatus) {
        this.sdCardRollupStatus = sdCardRollupStatus;
    }


    public RollupStatus getRollupStatus() {
        return rollupStatus;
    }


    public void setRollupStatus(RollupStatus rollupStatus) {
        this.rollupStatus = rollupStatus;
    }


    public CimUnsignedInt getServerAllocation() {
        return serverAllocation;
    }


    public void setServerAllocation(CimUnsignedInt serverAllocation) {
        this.serverAllocation = serverAllocation;
    }


    public CimString getServiceTag() {
        return serviceTag;
    }


    public void setServiceTag(CimString serviceTag) {
        this.serviceTag = serviceTag;
    }


    public StorageRollupStatus getStorageRollupStatus() {
        return storageRollupStatus;
    }


    public void setStorageRollupStatus(StorageRollupStatus storageRollupStatus) {
        this.storageRollupStatus = storageRollupStatus;
    }


    public SysMemErrorInfo getSysMemErrorInfo() {
        return sysMemErrorInfo;
    }


    public void setSysMemErrorInfo(SysMemErrorInfo sysMemErrorInfo) {
        this.sysMemErrorInfo = sysMemErrorInfo;
    }


    public SysMemErrorMethodology getSysMemErrorMethodology() {
        return sysMemErrorMethodology;
    }


    public void setSysMemErrorMethodology(SysMemErrorMethodology sysMemErrorMethodology) {
        this.sysMemErrorMethodology = sysMemErrorMethodology;
    }


    public CimString getSysMemFailOverState() {
        return sysMemFailOverState;
    }


    public void setSysMemFailOverState(CimString sysMemFailOverState) {
        this.sysMemFailOverState = sysMemFailOverState;
    }


    public SysMemLocation getSysMemLocation() {
        return sysMemLocation;
    }


    public void setSysMemLocation(SysMemLocation sysMemLocation) {
        this.sysMemLocation = sysMemLocation;
    }


    public SysMemPrimaryStatus getSysMemPrimaryStatus() {
        return sysMemPrimaryStatus;
    }


    public void setSysMemPrimaryStatus(SysMemPrimaryStatus sysMemPrimaryStatus) {
        this.sysMemPrimaryStatus = sysMemPrimaryStatus;
    }


    public CimUnsignedInt getSysMemTotalSize() {
        return sysMemTotalSize;
    }


    public void setSysMemTotalSize(CimUnsignedInt sysMemTotalSize) {
        this.sysMemTotalSize = sysMemTotalSize;
    }


    public CimUnsignedInt getSysMemMaxCapacitySize() {
        return sysMemMaxCapacitySize;
    }


    public void setSysMemMaxCapacitySize(CimUnsignedInt sysMemMaxCapacitySize) {
        this.sysMemMaxCapacitySize = sysMemMaxCapacitySize;
    }


    public CimString getSystemGeneration() {
        return systemGeneration;
    }


    public void setSystemGeneration(CimString systemGeneration) {
        this.systemGeneration = systemGeneration;
    }


    public CimUnsignedInt getSystemID() {
        return systemID;
    }


    public void setSystemID(CimUnsignedInt systemID) {
        this.systemID = systemID;
    }


    public SystemRevision getSystemRevision() {
        return systemRevision;
    }


    public void setSystemRevision(SystemRevision systemRevision) {
        this.systemRevision = systemRevision;
    }


    public TempRollupStatus getTempRollupStatus() {
        return tempRollupStatus;
    }


    public void setTempRollupStatus(TempRollupStatus tempRollupStatus) {
        this.tempRollupStatus = tempRollupStatus;
    }


    public TempStatisticsRollupStatus getTempStatisticsRollupStatus() {
        return tempStatisticsRollupStatus;
    }


    public void setTempStatisticsRollupStatus(TempStatisticsRollupStatus tempStatisticsRollupStatus) {
        this.tempStatisticsRollupStatus = tempStatisticsRollupStatus;
    }


    public CimString getUuid() {
        return uuid;
    }


    public void setUuid(CimString uuid) {
        this.uuid = uuid;
    }


    public VoltRollupStatus getVoltRollupStatus() {
        return voltRollupStatus;
    }


    public void setVoltRollupStatus(VoltRollupStatus voltRollupStatus) {
        this.voltRollupStatus = voltRollupStatus;
    }


    public CimString getSmbiosGUID() {
        return smbiosGUID;
    }


    public void setSmbiosGUID(CimString smbiosGUID) {
        this.smbiosGUID = smbiosGUID;
    }


    public List<Object> getAny() {
        return any;
    }


    public void setAny(List<Object> any) {
        this.any = any;
    }


    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }
}