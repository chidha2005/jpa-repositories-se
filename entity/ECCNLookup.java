package com.arrow.trade.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "ECCN_LOOKUP")
public class ECCNLookup {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "ECCN_CITATION")
	private String eccnCitation;

	@Column(name = "ECCN_CODE")
	private String eccnCode;

	@Column(name = "DESCRIPTION")
	private String description;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_AT")
	private Date createdAt;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
