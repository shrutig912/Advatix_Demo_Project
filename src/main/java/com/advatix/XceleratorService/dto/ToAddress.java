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
public class ToAddress {
    @JsonProperty("name")
    public String name;
    @JsonProperty("address_one")
    public String addressOne;
    @JsonProperty("address_two")
    public String addressTwo;
    @JsonProperty("address_three")
    public String addressThree;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("note")
    public String note;
    @JsonProperty("contact")
    public String contact;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("email")
    public String email;

    
}