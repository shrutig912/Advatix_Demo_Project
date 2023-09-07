package com.advatix.fedexrest.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "carrier_services")
public class CarrierServices {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "carrierName")
	private String carrierName;

	@Column(name = "serviceType")
	private String serviceType;

	@Column(name = "serviceName")
	private String serviceName;

	@Column(name = "serviceCode")
	private String serviceCode;
	
}
