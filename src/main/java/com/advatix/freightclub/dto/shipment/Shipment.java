package com.advatix.freightclub.dto.shipment;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Transient;
import java.util.Date;


/**
 * @author Arbind Sharma
 * Created On 09-11-2021
 */

@Data
public class Shipment {

    private Long id;
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


    private String targetStringDate;

    private String shipmentInstruction;


    private String beginStringDate;

    private String targetDeliveryTime;

    private Integer shipperId;
    private String barcode;
    private String trackingId;
    private Integer deliveryType;
    private String serviceType;
    private String lineHaul;

    private String shipmentType;
    private Date rescheduleDateTime;
    private Integer status;

    private Long providerId;
    private Date puDue;
    private Date puRequested;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatedOn;
    private Integer locationId;
    private Integer exceptionStatus;
    private String locationRefNo;

    private String puReadyStartTimestamp;
    private String puReadyEndTimestamp;
    private String delCommitStartTimestamp;
    private String delCommitEndTimestamp;

    private String labelRaw;

    private String beginDateTime;
    private String cxEmail;
    private String cxPhone;
    private String productType;
    private String routeCode;

    private String carrierName;
    private Integer carrierId;
    private String serviceReturnStatus;
    private String carrierTrackingId;
    private String marketCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdOn;
    private Integer printCount;
    private Boolean printStatus;
    private String tforceFilePath;

    private String accountId;
    private Date estimatedDeliveryDate;
    //private String licencePlateNumber;
    private Integer notificationFlag;
    private Integer signatureRequired;
    private Integer isReturnOrder;

    private Date returnDate;
    private Integer shipstationOrder = 0;
    private String sourceCompanyName;
    private Integer saturdayDelivery = 0;
    private boolean alcoholShipment;

    private ShipmentDimensionDto dimension;

    private String referenceId;

    private String boxDimensions;


    private String currency;
    private Integer freight;
    private Integer declaredValue;
    private Integer insuredValue;

    private Double insuredAmount;
    private Boolean dutiesPaid;

    private String weShipBarcodeStatus;


    @Transient
    private String internalTrackingNumber;
}
