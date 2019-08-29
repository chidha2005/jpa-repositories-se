package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.ResponseData;

@RepositoryRestResource(collectionResourceRel = "responseData", path = "responseData")
public interface ResponseDataRepository extends CrudRepository<ResponseData, Long> {

}
