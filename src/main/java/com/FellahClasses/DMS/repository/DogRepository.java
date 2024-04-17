package com.FellahClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.FellahClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
}
