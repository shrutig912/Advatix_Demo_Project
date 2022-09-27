package com.advatix.XceleratorService.dto;
/**
 * @author Amit Rajput
 * Created On 07-01-2022
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConciseResponseDto {
    @JsonProperty("declared_value")
    public String declaredValue;
    @JsonProperty("cod_amount")
    public String codAmount;
    @JsonProperty("account_number")
    public String accountNumber;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("reference_two")
    public String referenceTwo;
    @JsonProperty("reference_three")
    public String referenceThree;
    @JsonProperty("carrier_id")
    public String carrierId;
    @JsonProperty("serviceName")
    public String service_name;
    @JsonProperty("package")
    public Package packages;
    @JsonProperty("from_address")
    public FromAddress fromAddress;
    @JsonProperty("to_address")
    public ToAddress toAddress;
    @JsonProperty("shipment_number")
    public String shipmentNumber;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("label")
    public String label;
    @JsonProperty("label_zpl")
    public String labelZpl;
    @JsonProperty("sort_code")
    public String sortCode;
    @JsonProperty("tracking")
    public Tracking tracking;
    @JsonProperty("queue")
    public boolean queue;

    
}