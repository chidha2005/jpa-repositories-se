package com.arrow.trade.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "HTSLOOKUP_TABLE")
public class HTSLookup {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	@Column(name = "HTS")
	private String hts;

	@Column(name = "HTS_CODE")
	private String htsCode;

	@Column(name = "SUFFIX")
	private String suffix;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "UNIT_OF_MEASURE")
	private String unitOfMeasure;

}
