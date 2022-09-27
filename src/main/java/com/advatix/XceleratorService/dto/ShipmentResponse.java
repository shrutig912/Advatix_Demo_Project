package com.advatix.XceleratorService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

@JsonInclude(Include.NON_NULL)
public class ShipmentResponse {
	private int responseStatus;
	private String responseString;
	private String orderId;
	private String trackingNumber;
	private String carrierName;
	private String carrierTrackingId;
	private String bolFilePath;
	private String labelFilePath;
	List<String> trackingIds;
	private List<String> clientTrackingId;
	private List<String> advatixTrackingId;
	private String BOLID;
	
	private String carrierInternalTrackingId;

	public String getBOLID() {
		return BOLID;
	}

	public void setBOLID(String bOLID) {
		BOLID = bOLID;
	}

	public List<String> getClientTrackingId() {
		return clientTrackingId;
	}

	public void setClientTrackingId(List<String> clientTrackingId) {
		this.clientTrackingId = clientTrackingId;
	}

	public List<String> getAdvatixTrackingId() {
		return advatixTrackingId;
	}

	public void setAdvatixTrackingId(List<String> advatixTrackingId) {
		this.advatixTrackingId = advatixTrackingId;
	}

	public List<String> getTrackingIds() {
		return trackingIds;
	}

	public void setTrackingIds(List<String> trackingIds) {
		this.trackingIds = trackingIds;
	}

	public String getBolFilePath() {
		return bolFilePath;
	}

	public void setBolFilePath(String bolFilePath) {
		this.bolFilePath = bolFilePath;
	}

	public String getLabelFilePath() {
		return labelFilePath;
	}

	public void setLabelFilePath(String labelFilePath) {
		this.labelFilePath = labelFilePath;
	}

	/**
	 * @return the responseStatus
	 */
	public int getResponseStatus() {
		return responseStatus;
	}

	/**
	 * @param responseStatus the responseStatus to set
	 */
	public void setResponseStatus(int responseStatus) {
		this.responseStatus = responseStatus;
	}

	/**
	 * @return the responseString
	 */
	public String getResponseString() {
		return responseString;
	}

	/**
	 * @param responseString the responseString to set
	 */
	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}

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
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierTrackingId() {
		return carrierTrackingId;
	}

	public void setCarrierTrackingId(String carrierTrackingId) {
		this.carrierTrackingId = carrierTrackingId;
	}

	public String getCarrierInternalTrackingId() {
		return carrierInternalTrackingId;
	}

	public void setCarrierInternalTrackingId(String carrierInternalTrackingId) {
		this.carrierInternalTrackingId = carrierInternalTrackingId;
	}

}
