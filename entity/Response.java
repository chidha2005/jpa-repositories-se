package com.arrow.trade.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "RESPONSE")
public class Response {

	@Column(name = "ID")
	@Id
	private Long id;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "RESPONSE_DATA_ID")
	private String responsedataId;

	@Column(name = "CREATED_AT")
	private Date createdAt;

	@Column(name = "DURATION")
	private Long duration;

	@Column(name = "STATUS")
	private String status;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "response", cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<ResponseData> responsedata;

	@OneToOne
	@MapsId
	private Requests requests;

}
