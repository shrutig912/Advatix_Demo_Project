package com.advatix.XceleratorService.dto;

import java.util.Date;

public class ShipmentReq {

    private String orderId;
    private String orderType;
    private String shipFromName;
    private String shipFromAddress;
    private String shipFromAddress2;
    private String shipFromCity;
    private String shipFromStateCode;
    private String shipFromPostalCode;
    private String shipFromCountryCode;
    private String shipFromPhone;
    private String shipFromEmail;
    private String shipToAddressType;
    private String shipToName;
    private String shipToAddress;
    private String shipToAddress2;
    private String shipToCity;
    private String shipToStateCode;
    private String shipToPostalCode;
    private String shipToCountryCode;
    private String shipToPhone;
    private String shipToEmail;
    private float weightLbs;
    private int numberOfItems;
    private String targetDate;
    private String shipmentInstruction;
    private String beginDate;

    private String targetDeliveryTime;
    private int shipperId;
    private String deliveryType;
    private String accessLicenseNumber;
    private String serviceType;
    private String lineHaul;
    private long providerId;
    private Shipper shipperUser;
    private Integer locationId;
    private String locationIdOms;
    private Date targetDate2;
  //  private Date beginDate2;
    private String locationRefNo;
    private String pod;

    private String beginDateTime;
    private String cxEmail;
    private String cxPhone;
    private String productType;
    private String routeCode;
    private String marketCode;

    private String accountId;
    private Integer carrierId;
    private String carrierName;
    private Integer notificationFlag;

    private Integer signatureRequired = 0;
    private String returnDate;
    private Date returnDate2;
    private Integer shipstationOrder = 0;
    private String sourceCompanyName;

    private Integer packageType = 0;
    private Integer saturdayDelivery = 0;

    private boolean alcoholShipment = false;

    private ShipmentDimension dimension;

    private String referenceId;

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the shipFromName
     */
    public String getShipFromName() {
        return shipFromName;
    }

    /**
     * @param shipFromName the shipFromName to set
     */
    public void setShipFromName(String shipFromName) {
        this.shipFromName = shipFromName;
    }

    /**
     * @return the shipFromAddress
     */
    public String getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * @param shipFromAddress the shipFromAddress to set
     */
    public void setShipFromAddress(String shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    /**
     * @return the shipFromCity
     */
    public String getShipFromCity() {
        return shipFromCity;
    }

    /**
     * @param shipFromCity the shipFromCity to set
     */
    public void setShipFromCity(String shipFromCity) {
        this.shipFromCity = shipFromCity;
    }

    /**
     * @return the shipFromStateCode
     */
    public String getShipFromStateCode() {
        return shipFromStateCode;
    }

    /**
     * @param shipFromStateCode the shipFromStateCode to set
     */
    public void setShipFromStateCode(String shipFromStateCode) {
        this.shipFromStateCode = shipFromStateCode;
    }

    /**
     * @return the shipFromPostalCode
     */
    public String getShipFromPostalCode() {
        return shipFromPostalCode;
    }

    /**
     * @param shipFromPostalCode the shipFromPostalCode to set
     */
    public void setShipFromPostalCode(String shipFromPostalCode) {
        this.shipFromPostalCode = shipFromPostalCode;
    }

    /**
     * @return the shipFromCountryCode
     */
    public String getShipFromCountryCode() {
        return shipFromCountryCode;
    }

    /**
     * @param shipFromCountryCode the shipFromCountryCode to set
     */
    public void setShipFromCountryCode(String shipFromCountryCode) {
        this.shipFromCountryCode = shipFromCountryCode;
    }

    /**
     * @return the shipFromPhone
     */
    public String getShipFromPhone() {
        return shipFromPhone;
    }

    /**
     * @param shipFromPhone the shipFromPhone to set
     */
    public void setShipFromPhone(String shipFromPhone) {
        this.shipFromPhone = shipFromPhone;
    }

    /**
     * @return the shipToName
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * @param shipToName the shipToName to set
     */
    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    /**
     * @return the shipToAddress
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * @param shipToAddress the shipToAddress to set
     */
    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    /**
     * @return the shipToCity
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * @param shipToCity the shipToCity to set
     */
    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    /**
     * @return the shipToStateCode
     */
    public String getShipToStateCode() {
        return shipToStateCode;
    }

    /**
     * @param shipToStateCode the shipToStateCode to set
     */
    public void setShipToStateCode(String shipToStateCode) {
        this.shipToStateCode = shipToStateCode;
    }

    /**
     * @return the shipToPostalCode
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * @param shipToPostalCode the shipToPostalCode to set
     */
    public void setShipToPostalCode(String shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }

    /**
     * @return the shipToCountryCode
     */
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    /**
     * @param shipToCountryCode the shipToCountryCode to set
     */
    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    /**
     * @return the shipToPhone
     */
    public String getShipToPhone() {
        return shipToPhone;
    }

    /**
     * @param shipToPhone the shipToPhone to set
     */
    public void setShipToPhone(String shipToPhone) {
        this.shipToPhone = shipToPhone;
    }

    /**
     * @return the weightLbs
     */
    public float getWeightLbs() {
        return weightLbs;
    }

    /**
     * @param weightLbs the weightLbs to set
     */
    public void setWeightLbs(float weightLbs) {
        this.weightLbs = weightLbs;
    }

    /**
     * @return the numberOfItems
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * @param numberOfItems the numberOfItems to set
     */
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * @return the targetDate
     */
    public String getTargetDate() {
        return targetDate;
    }

    /**
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    /**
     * @return the shipperUser
     */
    public Shipper getShipperUser() {
        return shipperUser;
    }

    /**
     * @param shipperUser the shipperUser to set
     */
    public void setShipperUser(Shipper shipperUser) {
        this.shipperUser = shipperUser;
    }

    /**
     * @return the accessLicenseNumber
     */
    public String getAccessLicenseNumber() {
        return accessLicenseNumber;
    }

    /**
     * @param accessLicenseNumber the accessLicenseNumber to set
     */
    public void setAccessLicenseNumber(String accessLicenseNumber) {
        this.accessLicenseNumber = accessLicenseNumber;
    }

    /**
     * @return the orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * @param orderType the orderType to set
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * @return the shipFromAddress2
     */
    public String getShipFromAddress2() {
        return shipFromAddress2;
    }

    /**
     * @param shipFromAddress2 the shipFromAddress2 to set
     */
    public void setShipFromAddress2(String shipFromAddress2) {
        this.shipFromAddress2 = shipFromAddress2;
    }

    /**
     * @return the shipFromEmail
     */
    public String getShipFromEmail() {
        return shipFromEmail;
    }

    /**
     * @param shipFromEmail the shipFromEmail to set
     */
    public void setShipFromEmail(String shipFromEmail) {
        this.shipFromEmail = shipFromEmail;
    }

    /**
     * @return the shipToAddressType
     */
    public String getShipToAddressType() {
        return shipToAddressType;
    }

    /**
     * @param shipToAddressType the shipToAddressType to set
     */
    public void setShipToAddressType(String shipToAddressType) {
        this.shipToAddressType = shipToAddressType;
    }

    /**
     * @return the shipToAddress2
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * @param shipToAddress2 the shipToAddress2 to set
     */
    public void setShipToAddress2(String shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }

    /**
     * @return the shipToEmail
     */
    public String getShipToEmail() {
        return shipToEmail;
    }

    /**
     * @param shipToEmail the shipToEmail to set
     */
    public void setShipToEmail(String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }

    /**
     * @return the shipmentInstruction
     */
    public String getShipmentInstruction() {
        return shipmentInstruction;
    }

    /**
     * @param shipmentInstruction the shipmentInstruction to set
     */
    public void setShipmentInstruction(String shipmentInstruction) {
        this.shipmentInstruction = shipmentInstruction;
    }

    /**
     * @return the beginDate
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate the beginDate to set
     */

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return the targetDeliveryTime
     */
    public String getTargetDeliveryTime() {
        return targetDeliveryTime;
    }

    /**
     * @param targetDeliveryTime the targetDeliveryTime to set
     */
    public void setTargetDeliveryTime(String targetDeliveryTime) {
        this.targetDeliveryTime = targetDeliveryTime;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getLineHaul() {
        return lineHaul;
    }

    public void setLineHaul(String lineHaul) {
        this.lineHaul = lineHaul;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationIdOms() {
        return locationIdOms;
    }

    public void setLocationIdOms(String locationIdOms) {
        this.locationIdOms = locationIdOms;
    }

    public Date getTargetDate2() {
        return targetDate2;
    }

    public void setTargetDate2(Date targetDate2) {
        this.targetDate2 = targetDate2;
    }

	/*
	 * public Date getBeginDate2() { return beginDate2; }
	 * 
	 * public void setBeginDate2(Date beginDate2) { this.beginDate2 = beginDate2; }
	 */

    public String getLocationRefNo() {
        return locationRefNo;
    }

    public void setLocationRefNo(String locationRefNo) {
        this.locationRefNo = locationRefNo;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(String beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public String getCxEmail() {
        return cxEmail;
    }

    public void setCxEmail(String cxEmail) {
        this.cxEmail = cxEmail;
    }

    public String getCxPhone() {
        return cxPhone;
    }

    public void setCxPhone(String cxPhone) {
        this.cxPhone = cxPhone;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Integer getNotificationFlag() {
        return notificationFlag;
    }

    public void setNotificationFlag(Integer notificationFlag) {
        this.notificationFlag = notificationFlag;
    }

    public Integer getSignatureRequired() {
        return signatureRequired;
    }

    public void setSignatureRequired(Integer signatureRequired) {
        this.signatureRequired = signatureRequired;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getShipstationOrder() {
        return shipstationOrder;
    }

    public void setShipstationOrder(Integer shipstationOrder) {
        this.shipstationOrder = shipstationOrder;
    }

    public Date getReturnDate2() {
        return returnDate2;
    }

    public void setReturnDate2(Date returnDate2) {
        this.returnDate2 = returnDate2;
    }

    public String getSourceCompanyName() {
        return sourceCompanyName;
    }

    public void setSourceCompanyName(String sourceCompanyName) {
        this.sourceCompanyName = sourceCompanyName;
    }

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public Integer getSaturdayDelivery() {
        return saturdayDelivery;
    }

    public void setSaturdayDelivery(Integer saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }

    public boolean isAlcoholShipment() {
        return alcoholShipment;
    }

    public void setAlcoholShipment(boolean alcoholShipment) {
        this.alcoholShipment = alcoholShipment;
    }

    public ShipmentDimension getDimension() {
        return dimension;
    }

    public void setDimension(ShipmentDimension dimension) {
        this.dimension = dimension;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }


}
