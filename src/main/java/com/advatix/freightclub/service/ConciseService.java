package com.advatix.freightclub.service;

import com.advatix.freightclub.entity.CarrierAccounts;
import com.advatix.freightclub.repository.CarrierAccountRepo;
import com.advatix.freightclub.utils.CommonFunctions;
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



}
