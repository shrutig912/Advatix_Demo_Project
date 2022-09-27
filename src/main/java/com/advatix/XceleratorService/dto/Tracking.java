package com.advatix.XceleratorService.dto;
/**
 * @author Amit Rajput
 * Created On 07-01-2022
 */


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tracking {
    @JsonProperty("zone")
    public String zone;
    @JsonProperty("scheduled_date")
    public String scheduledDate;
    @JsonProperty("delivery")
    public Delivery delivery;
    @JsonProperty("fees")
    public List<Fee> fees;
    @JsonProperty("events")
    public List<Event> events;
    @JsonProperty("status")
    public Status status;
    @JsonProperty("carrier_tracking_number")
    public String carrierTrackingNumber;

   
}