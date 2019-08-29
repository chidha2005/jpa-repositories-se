package com.arrow.trade.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.arrow.trade.util.ContextDataEnumStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CONTEXT_DATA")
public class ContextData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	@Column(name = "SYSTEM_ID")
	private String systemId;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "ORDER_NUMBER")
	private String orderNumber;

	@Column(name = "ORDER_TYPE")
	private String orderType;

	@Column(name = "ORIGIN_COUNTRYCODE")
	private String originCountrycode;

	@Column(name = "DESTINATION_COUNTRYCODE")
	private String destinationCountrycode;

	@Column(name = "FINALDESTINATION_COUNTRYCODE")
	private String finaldestinationCountrycode;

	@Column(name = "CREATED_AT")
	private Date createdAt;

	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private ContextDataEnumStatus status;

}
