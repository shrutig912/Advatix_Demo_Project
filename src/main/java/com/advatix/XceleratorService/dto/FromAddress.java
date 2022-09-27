package com.advatix.XceleratorService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FromAddress {
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
    @JsonProperty("email")
    public String email;
    @JsonProperty("phone")
    public String phone;

    
}