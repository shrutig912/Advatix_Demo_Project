package com.advatix.XceleratorService.controller;

import com.advatix.XceleratorService.dto.ConciseResponseDto;
import com.advatix.XceleratorService.dto.ConciseShipmentRequestDto;
import com.advatix.XceleratorService.exception.CustomException;
import com.advatix.XceleratorService.service.ConciseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/shipment")
@Api(value = "/concise", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
		"CONCISE API's Collection " }, hidden = false)
@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
		@ApiResponse(code = 401, message = "Not Authorized"), @ApiResponse(code = 403, message = "Not Authenticated"),
		@ApiResponse(code = 404, message = "Not found"), @ApiResponse(code = 500, message = "Internal Server Error") })
public class ConciseController {

	@Autowired
	ConciseService conciseService;

	@ApiOperation(value = "Create Concise Shipment", response = ConciseResponseDto.class, httpMethod = "POST", notes = "Create CONCISE Shipment")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "", response = ConciseResponseDto.class) })
	@PostMapping(value = "/shipmentForwardDataPopulate")
	public ConciseResponseDto shipmentForwardDataPopulate(@RequestBody ConciseShipmentRequestDto request) throws Exception {
		log.info("Inside Concise Shipment Controller !!!!!!!!!!!");
		return conciseService.getShipmentDataPopulationRequest(request);

	}
	
    @ApiOperation(value = "Fetch Concise Shipment Records", response = ConciseResponseDto.class, httpMethod = "GET", notes = "Fetch Shipment Records")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "", response = ConciseResponseDto.class)})
    @GetMapping(value = "/getTrackDetails/{strcnno}")
    public ConciseResponseDto getShipmentTracking(@PathVariable("carrierTrackingId") String carrierTrackingId) throws CustomException {
        log.info("Inside getTrackDetails Controller!!!!!!!!!!!!!!!!");
        return conciseService.getShipmentTracking(carrierTrackingId);

    }
	
}
