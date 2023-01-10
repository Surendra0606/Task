package com.practice.productionApp.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.productionApp.model.Production;
@Repository

public interface ProdRepository extends MongoRepository<Production, String>{

}
