package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository  //Not necessary for this lab
public interface BakerRepository extends CrudRepository<Baker, Long> {
}
