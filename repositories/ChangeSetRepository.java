package com.arrow.trade.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arrow.trade.entity.ChangeSet;

import io.swagger.annotations.Api;

@RepositoryRestResource(path = "changeSet")
@Api(tags = "ChangeSet Entity")
public interface ChangeSetRepository extends CrudRepository<ChangeSet, Long> {

}
