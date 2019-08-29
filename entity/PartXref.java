package com.arrow.trade.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "PARTXREF_TABLE")
public class PartXref {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "SYSTEM_ID")
	private String systemId;

	@Column(name = "PART_NAME")
	private String partName;

	@Column(name = "MFR_NAME")
	private String mfrName;

	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
