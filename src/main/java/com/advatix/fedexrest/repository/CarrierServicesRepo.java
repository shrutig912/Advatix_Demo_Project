package com.advatix.fedexrest.repository;

import com.advatix.fedexrest.entity.CarrierServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierServicesRepo extends JpaRepository<CarrierServices, Long> {

	

	

}
