package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.MfrXref;

@RepositoryRestResource(collectionResourceRel = "mfrXref", path = "mfrXref")
public interface MfrXrefRepository extends CrudRepository<MfrXref, Long> {

}
