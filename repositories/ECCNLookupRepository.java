package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.ECCNLookup;

@RepositoryRestResource(collectionResourceRel = "eccnLookup", path = "eccnLookup")
public interface ECCNLookupRepository extends CrudRepository<ECCNLookup, Long> {

}
