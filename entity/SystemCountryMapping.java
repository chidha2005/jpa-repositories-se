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
@Table(name = "SYSTEM_COUNTRY_MAPPING")
public class SystemCountryMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@Column(name = "ID")
	private Long id;

	@Column(name = "SYSTEM_ID")
	private String systemId;

	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "systemLookup", cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<SystemLookup> systemLookup;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "countryLookup", cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<CountryLookup> countryLookup;
}
