package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.PartXref;

@RepositoryRestResource(collectionResourceRel = "partXref", path = "partXref")
public interface PartXrefRepository extends CrudRepository<PartXref, Long> {

}
