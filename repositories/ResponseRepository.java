package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.Response;

@RepositoryRestResource(collectionResourceRel = "response", path = "response")
public interface ResponseRepository extends CrudRepository<Response, Long> {

}
