package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.ContextData;

@RepositoryRestResource(collectionResourceRel = "contextData", path = "contextData")
public interface ContextDataRepository extends CrudRepository<ContextData, Long> {

}
