package com.advatix.fedexrest.dto.shipment.local;

import com.advatix.fedexrest.utils.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * @author Arbind Sharma
 * Created On 09-11-2021
 */

@Entity
@Table(name = "shipment")
@Data
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_type")
    private String orderType;
    @Column(name = "ship_from_name")
    private String shipFromName;
    @Column(name = "ship_from_address")
    private String shipFromAddress;
    @Column(name = "ship_from_address2")
    private String shipFromAddress2;
    @Column(name = "ship_from_city")
    private String shipFromCity;
    @Column(name = "ship_from_state_code")
    private String shipFromStateCode;
    @Column(name = "ship_from_postal_code")
    private String shipFromPostalCode;
    @Column(name = "ship_from_country_code")
    private String shipFromCountryCode;
    @Column(name = "ship_from_phone")
    private String shipFromPhone;
    @Column(name = "ship_from_email")
    private String shipFromEmail;

    @Column(name = "ship_to_address_type")
    private String shipToAddressType;
    @Column(name = "ship_to_name")
    private String shipToName;
    @Column(name = "ship_to_address")
    private String shipToAddress;
    @Column(name = "ship_to_address2")
    private String shipToAddress2;
    @Column(name = "ship_to_city")
    private String shipToCity;
    @Column(name = "ship_to_state_code")
    private String shipToStateCode;
    @Column(name = "ship_to_postal_code")
    private String shipToPostalCode;
    @Column(name = "ship_to_country_code")
    private String shipToCountryCode;
    @Column(name = "ship_to_phone")
    private String shipToPhone;
    @Column(name = "ship_to_email")
    private String shipToEmail;

    @Column(name = "weight_kg")
    private float weightLbs;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "number_of_items")
    private Integer numberOfItems;

    @Column(name = "shipment_instruction")
    private String shipmentInstruction;
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Column(name = "begin_date")
    private Date beginDate;
    @Column(name = "target_delivery_time")
    private String targetDeliveryTime;
    @Column(name = "shipperId")
    private Integer shipperId;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "trackingId")
    private String trackingId;
    @Column(name = "deliveryType")
    private Integer deliveryType;
    @Column(name = "serviceType", length = 10)
    private String serviceType;
    @Column(name = "shipmentType")
    private String shipmentType;
    @Column(name = "status")
    private Integer status;
    @Column(name = "providerId")
    private Long providerId;
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Column(name = "updated_on")
    private Date updatedOn;
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Column(name = "created_on")
    private Date createdOn;
    private String beginDateTime;
    private String cxEmail;
    private String cxPhone;
    private String productType;
    private String routeCode;
    @Column(name = "carrierName")
    private String carrierName;
    private Integer carrierId;
    @Column(name = "serviceReturnStatus")
    private String serviceReturnStatus;
    @Column(name = "carrierTrackingId")
    private String carrierTrackingId;
    @Column(name = "printCount")
    private Integer printCount;
    @Column(name = "printStatus")
    private Boolean printStatus;
    @Column(name = "podFilePath")
    private String podFilePath;
    @Column(name = "accountId")
    private String accountId;
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Column(name = "estimatedDeliveryDate")
    private Date estimatedDeliveryDate;
    @Column(name = "IsReturnOrder")
    private Integer isReturnOrder;
    @Column(name = "returnDate")
    private Date returnDate;
    @Column(name = "sourceCompanyName")
    private String sourceCompanyName;

    @Column(name = "boxDimensions")
    private String boxDimensions;

    @Transient
    private ShipmentDimensionDto dimension;
    @Transient
    private String referenceId;

    @Column(name = "paymentMode")
    private Integer paymentMode;
    @Column(name = "notificationFlag")
    private int notificationFlag;

}
