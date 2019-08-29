package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.MasterPart;

@RepositoryRestResource(collectionResourceRel = "masterPart", path = "masterPart")
public interface MasterPartRepository extends CrudRepository<MasterPart, Long> {

}
