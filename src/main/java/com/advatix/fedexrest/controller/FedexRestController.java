package com.advatix.fedexrest.controller;

import com.advatix.fedexrest.service.FedexRestService;
import com.advatix.fedexrest.service.FedexRestService;
import io.swagger.annotations.Api;
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
public class FedexRestController {

	@Autowired
	FedexRestService fedexrestService;
/*
	@ApiOperation(value = "Create Concise Shipment", response = ConciseResponseDto.class, httpMethod = "POST", notes = "Create CONCISE Shipment")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "", response = ConciseResponseDto.class) })
	@PostMapping(value = "/shipmentForwardDataPopulate")
	public ConciseResponseDto shipmentForwardDataPopulate(@RequestBody ConciseShipmentRequestDto request) throws Exception {
		log.info("Inside Concise Shipment Controller !!!!!!!!!!!");
		return conciseService.getShipmentDataPopulationRequest(request);

	}*/

}
