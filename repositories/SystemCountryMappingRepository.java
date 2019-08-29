package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.SystemCountryMapping;

@RepositoryRestResource(collectionResourceRel = "systemCountryMapping", path = "systemCountryMapping")
public interface SystemCountryMappingRepository extends CrudRepository<SystemCountryMapping, Long> {

}
