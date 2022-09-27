package com.advatix.XceleratorService.dto;

/**
 * @author Amit Rajput
 * Created On 07-01-2022
 */


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConciseShipmentRequestDto {

    @JsonProperty("account_number")
    public String accountNumber;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("reference_two")
    public String referenceTwo;
    @JsonProperty("carrier_id")
    public String carrierId;    
    @JsonProperty("service_name")
    public String serviceName;
    @JsonProperty("declared_value")
    public String declaredValue;
    @JsonProperty("cod_amount")
    public String codAmount;
    @JsonProperty("signature_required")
    public boolean signatureRequired;
    @JsonProperty("async")
    public boolean async;
    @JsonProperty("queue")
    public boolean queue;
    @JsonProperty("sort_code")
    public String sortCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("to_address")
    public ToAddress toAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("from_address")
    public FromAddress fromAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("package")
    public Package packages;
    
    @JsonProperty("productType")
    public String productType;
    
    

}