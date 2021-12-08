package com.ciclo4.reto2.repository.crud;

import com.ciclo4.reto2.model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface LaptopCrudRepository extends MongoRepository<Laptop, Integer> {
    //Para seleccionar el producto con id maximo
    Optional<Laptop> findTopByOrderByIdDesc();
}
