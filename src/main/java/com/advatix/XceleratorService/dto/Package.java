package com.advatix.XceleratorService.dto;

/**
 * @author Amit Rajput
 * Created On 07-01-2022
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Package {
    @JsonProperty("weight")
    public int weight;
    @JsonProperty("height")
    public int height;
    @JsonProperty("length")
    public int length;
    @JsonProperty("width")
    public int width;
    @JsonProperty("description")
    public String description;

   
}