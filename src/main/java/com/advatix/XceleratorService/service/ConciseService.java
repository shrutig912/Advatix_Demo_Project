package com.advatix.XceleratorService.service;

import com.advatix.XceleratorService.dto.ConciseResponseDto;
import com.advatix.XceleratorService.dto.ConciseShipmentRequestDto;
import com.advatix.XceleratorService.entity.CarrierAccounts;
import com.advatix.XceleratorService.repository.CarrierAccountRepo;
import com.advatix.XceleratorService.utils.CommonFunctions;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@Slf4j
@Service("ConciseService")
public class ConciseService {

	@Value("${concise.base.url}")
	private String baseUrl;

	@Autowired
	private CarrierAccountRepo carrierAccountRepo;

	public ConciseResponseDto getShipmentDataPopulationRequest(ConciseShipmentRequestDto conciseShipmentRequestDto)
			throws Exception {

		log.info("Inside Concise Shipment Create service........!!!!!!!");
		ResponseEntity<ConciseResponseDto> clientResponse = null;

		CarrierAccounts carrierAccounts = getCarrierAccountDetails(conciseShipmentRequestDto);

		String conciseUrl = baseUrl + "/shipments";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add(carrierAccounts.getUserName(), carrierAccounts.getPassword());
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<ConciseShipmentRequestDto> entity = new HttpEntity<>(conciseShipmentRequestDto, headers);
		clientResponse = restTemplate.exchange(conciseUrl, HttpMethod.POST, entity, ConciseResponseDto.class);

		log.info("conciseShipmentRequestDto------------->" + CommonFunctions.objectToJson(conciseShipmentRequestDto));
		return !ObjectUtils.isEmpty(clientResponse) ? clientResponse.getBody() : null;
	}

	public ConciseResponseDto getShipmentTracking(String carrierTrackingId) {
		log.info("Inside Concise Shipment Tracking service");

		ConciseShipmentRequestDto shipment = new ConciseShipmentRequestDto();
		ConciseResponseDto conciseResponseDto = new ConciseResponseDto();
		try {
			CarrierAccounts carrierAccounts = getCarrierAccountDetails(shipment);

			String conciseGetUrl = baseUrl + "/shipments/" + carrierTrackingId;
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.add(carrierAccounts.getUserName(), carrierAccounts.getPassword());
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> reqEntity = new HttpEntity<String>("", headers);
			ResponseEntity<ConciseResponseDto> result = restTemplate.exchange(conciseGetUrl, HttpMethod.GET, reqEntity,
					ConciseResponseDto.class);
			conciseResponseDto = result.getBody();
			return conciseResponseDto;
		} catch (Exception e) {
			log.info("Inside Concise Shipment Tracking service" + e.getMessage());

		}
		return conciseResponseDto;
	}

	public CarrierAccounts getCarrierAccountDetails(ConciseShipmentRequestDto shipment) throws Exception {

		CarrierAccounts carrierAccounts = carrierAccountRepo.findByShipFromCityAndShipperIdAndCarrierNameAndProductType(
				shipment.fromAddress.getCity(), 0, shipment.getCarrierId(), shipment.getProductType());
		if (Objects.isNull(carrierAccounts)) {
			carrierAccounts = carrierAccountRepo.findByShipFromCityAndCarrierName("ALL", shipment.getCarrierId());

			if (Objects.isNull(carrierAccounts)) {
				throw new Exception("Carrier Account Detail Not Found");
			}

		}
		return carrierAccounts;

	}

}
