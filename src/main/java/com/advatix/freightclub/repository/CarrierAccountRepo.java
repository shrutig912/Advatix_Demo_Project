package com.advatix.freightclub.repository;

import com.advatix.freightclub.entity.CarrierAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierAccountRepo extends JpaRepository<CarrierAccounts, Long> {

	CarrierAccounts findByShipFromCityAndCarrierName(String shipFromCity, String carrierName);
	CarrierAccounts findByShipFromCityAndShipperIdAndCarrierNameAndProductType(String shipFromCity, int shipperId,
                                                                               String carrierName, String productType);

}
