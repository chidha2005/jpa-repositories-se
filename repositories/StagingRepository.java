package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.Staging;

@RepositoryRestResource(collectionResourceRel = "staging", path = "response")
public interface StagingRepository extends CrudRepository<Staging, Long> {

}
