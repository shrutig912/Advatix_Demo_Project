package com.advatix.fedexrest.service;

import com.advatix.fedexrest.repository.CarrierAccountRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service("fedexrest")
public class FedexRestService {

	@Value("${fedexrest.base.url}")
	private String baseUrl;

	@Autowired
	private CarrierAccountRepo carrierAccountRepo;



}
