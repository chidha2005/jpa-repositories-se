package com.arrow.trade.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@Entity
@Table(name = "PART_ATTRIBUTE")
public class PartAttribute {

	@Id
	private Long id;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FIELD_VALUE")
	private String fieldValue;

	@Column(name = "UNIT_OF_MEASURE")
	private String unitOfMeasure;

	@Column(name = "SOURCE")
	private String source;

	@ManyToOne
	@JoinColumn(name = "partAttributeId")
	private PartMapping partMapping;

}
