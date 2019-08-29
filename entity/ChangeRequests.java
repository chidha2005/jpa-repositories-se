package com.arrow.trade.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "CHANGE_REQUEST")
@ToString
public class ChangeRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "changeSetId")
	private ChangeSet changeSet;

	@Column(name = "PART_KEY")
	private String partKey;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "ORIGINAL_VALUE")
	private String originalValue;

	@Column(name = "NEW_VALUE")
	private String newValue;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_AT")
	private Date createdAt;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "APPROVED")
	private String approved;

	@Column(name = "APPROVED_BY")
	private String approvedBy;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPROVAL_DATE")
	private Date approvalDate;

	@Column(name = "HAS_ORDER_NUMBER")
	private boolean hasOrderNumber;

}
