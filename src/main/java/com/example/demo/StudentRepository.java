package com.example.demo;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends MongoRepository<StudentEntity, Integer> {

}
