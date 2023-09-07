package com.advatix.fedexrest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "carrier_accounts")
public class CarrierAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "shipFromCity")
    private String shipFromCity;
    @Column(name = "shipperId")
    private Integer shipperId;
    @Column(name = "accountNo")
    private String accountNo;
    @Column(name = "carrierName")
    private String carrierName;
    @Column(name = "createdOn")
    private Date createdOn;
    @Column(name = "status")
    private Integer status;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "accessKey")
    private String accessKey;
    @Column(name = "meterNo")
    private String meterNo;
    @Column(name = "thirdPartyAccountNo")
    private String thirdPartyAccountNo;
    @Column(name = "accountId")
    private String accountId;
    @Column(name = "productType")
    private String productType;
    @Column(name = "freightAccountNo")
    private String freightAccountNo;

}
