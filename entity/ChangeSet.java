package com.arrow.trade.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CHANGE_SET")
public class ChangeSet {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;

	@Column(name = "SOURCE_TYPE")
	private String sourceType;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COMMENTS")
	private String comments;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_AT")
	private Date createdAt;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "LOCKED_BY")
	private String lockedBy;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOCKED_DATE")
	private Date lockedDate;

	@Column(name = "PRIORITY")
	private String priority;

	@OneToMany(mappedBy = "changeSet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<ChangeRequests> changeRequests;

}
