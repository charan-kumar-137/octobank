package com.octobank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.octobank.model.CustomerAccountXRef;

@Repository
public interface CustomerAccountXRefRepository extends CrudRepository<CustomerAccountXRef, String> {

}
