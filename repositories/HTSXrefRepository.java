package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.HTSXref;

@RepositoryRestResource(collectionResourceRel = "htsXref", path = "htsXref")
public interface HTSXrefRepository extends CrudRepository<HTSXref, Long> {

}
