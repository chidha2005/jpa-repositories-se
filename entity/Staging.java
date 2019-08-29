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
@Table(name = "STAGING_TABLE")
public class Staging {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
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
	private String datasheetUrl;

	// is this pointing to another table using joins ====> Yes it is joining with
	// Master Part Table, Part Mapping
	// private List<Attribute> attribute;
	// @Column(name = "ATTRIBUTES1...ATTRIBUTES100")
	// private String attributes1...attributes100;

	@Column(name = "PRIORITY")
	private String priority;

	@Column(name = "US_STATUS")
	private String usStatus;

	@Column(name = "MAX_STATUS")
	private String maxStatus;

	@Column(name = "LOCKED")
	private String locked;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "LOCKED_BY")
	private String lockedBy;

	@Column(name = "LOCKED_DATA")
	private String lockedData;

	@Column(name = "CHANGESET_ID")
	private String changesetId;

	@Column(name = "UPDATED_AT")
	private String updatedAt;

	@Column(name = "PROCESSED")
	private String processed;

	@Column(name = "PROCESSED_TIMESTAMP")
	private String processedTimestamp;

}
