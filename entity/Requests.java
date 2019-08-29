package com.arrow.trade.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "REQUESTS")
public class Requests {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@Column(name = "ID")
	private Long id;

	@Column(name = "REQUEST_TYPE")
	private String requestType;

	@Column(name = "PART_NAME")
	private String partName;

	@Column(name = "MFR_NAME")
	private String mfrName;

	@Column(name = "SYSTEM_ID")
	private String systemId;

	@Column(name = "ORIGIN_COUNTRIES")
	private String originCountries;

	@Column(name = "DESTINATION_COUNTRIES")
	private String destinationCountries;

	@Column(name = "FINALDESTINATION_COUNTRIES")
	private String finalDestinationCountries;

	@Column(name = "ULTIMATE_CONSIGNEE")
	private String ultimateConsignee;

	@Column(name = "PART_KEY")
	private String partKey;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_AT")
	private Date createdAt;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "ORDER_NUMBER")
	private String orderNumber;

	@Column(name = "ORDER_TYPE")
	private String orderType;

	@Column(name = "CLASSIFICATION_TYPE")
	private String classificationType;

	@Column(name = "SHIP_TO")
	private String shipTo;

	@Column(name = "BILL_TO")
	private String billTo;

	@Column(name = "END_CUSTOMER")
	private String endCustomer;

	@OneToOne(mappedBy = "requests", cascade = CascadeType.ALL)
	private Response response;

}
