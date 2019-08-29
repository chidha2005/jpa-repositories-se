package com.arrow.trade.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "RESPONSE_DATA")
public class ResponseData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	@Column(name = "ORIGIN_COUNTRY_CODE")
	private String originCountryCode;

	@Column(name = "DESTINATION_COUNTRY_CODE")
	private String destinationCountryCode;

	@Column(name = "FINAL_DESTINATION_COUNTRY_CODE")
	private String finalDestinationCountrycode;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FIELD_VALUE")
	private String fieldValue;

	@Column(name = "LICENSE_REQUIRED")
	private String licenseRequired;

	@Column(name = "SHIP_TO")
	private String shipTo;

	@Column(name = "BILL_TO")
	private String billTo;

	@Column(name = "END_CUSTOMER")
	private String endCustomer;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RESPONSE_DATA_ID")
	private Response response;

}
