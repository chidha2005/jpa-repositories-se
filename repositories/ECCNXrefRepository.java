package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.ECCNXref;

@RepositoryRestResource(collectionResourceRel = "eccnXref", path = "eccnLookup")
public interface ECCNXrefRepository extends CrudRepository<ECCNXref, Long> {

}
  