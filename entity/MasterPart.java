package com.arrow.trade.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "MASTER_PART")
public class MasterPart {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "PART_NAME")
	private String partName;

	@Column(name = "MFR_NAME")
	private String mfrName;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ICC1")
	private String icc1;

	@Column(name = "ICC1_CODE")
	private String icc1Code;

	@Column(name = "ICC2")
	private String icc2;

	@Column(name = "ICC2_CODE")
	private String icc2Code;

	@Column(name = "ICC3")
	private String icc3;

	@Column(name = "ICC3_CODE")
	private String icc3Code;

	@Column(name = "DATASHEET_URL")
	private String datasheet_url;

	@OneToMany(mappedBy = "masterPart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PartMapping> partMappings;

}
