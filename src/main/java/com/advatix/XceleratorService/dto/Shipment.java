package com.advatix.XceleratorService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "orderId")
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
	private Integer numberOfItems;
	private String targetDate;

	private String shipmentInstruction;
	private String beginDate;
	private String targetDeliveryTime;

	private Integer shipperId;
	private String barcode;
	@Column(name = "trackingId")
	private String trackingId;
	private Integer deliveryType;
	@Column(name = "serviceType", length = 10)
	private String serviceType;
	private String lineHaul;

	private String shipmentType;
	private Date rescheduleDateTime;
	private Integer status;

	private Long providerId;
	private Date puDue;
	private Date puRequested;
	private Date updatedOn;
	private Integer locationId;
	private Integer exceptionStatus;
	private String locationRefNo;

	private String puReadyStartTimestamp;
	private String puReadyEndTimestamp;
	private String delCommitStartTimestamp;
	private String delCommitEndTimestamp;
	private MasterStatus masterStatus;

	private String labelRaw;

	private String beginDateTime;
	private String cxEmail;
	private String cxPhone;
	private String productType;
	private String routeCode;
	private UserShippers userDetails;

	@Column(name = "carrierName")
	private String carrierName;
	private Integer carrierId;
	private String serviceReturnStatus;
	@Column(name = "carrierTrackingId")
	private String carrierTrackingId;
	private String marketCode;

	private Date createdOn;
	private Integer printCount;
	private Boolean printStatus;
	private String tforceFilePath;
	private Users providerDetails;

	private String accountId;
	private Date estimatedDeliveryDate;
	// private String licencePlateNumber;
	private Integer notificationFlag;
	private Integer signatureRequired;
	private Integer isReturnOrder;

	private Date returnDate;
	private Integer shipstationOrder = 0;
	private String sourceCompanyName;
	private Integer saturdayDelivery = 0;
	private boolean alcoholShipment;

	private ShipmentDimension dimension;

	private String referenceId;

	private String boxDimensions;

	private String currency;
	private Integer freight;
	private Integer declaredValue;
	private Integer insuredValue;
	private Boolean dutiesPaid;

	private String weShipBarcodeStatus;

	
}
