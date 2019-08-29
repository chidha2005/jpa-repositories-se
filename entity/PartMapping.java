package com.arrow.trade.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "PART_MAPPING")
public class PartMapping {

	@Id
	private Long id;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "PART_ATTRIBUTE_ID")
	private String partAttributeId;

	@ManyToOne
	@JoinColumn(name = "masterPartId")
	private MasterPart masterPart;

	@ManyToOne
	@JoinColumn(name = "partAttribute")
	private PartAttribute partAttribute;

	@OneToMany(mappedBy = "partMappings", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PartMapping> partMappings;

}
