package com.ciclo4.reto2.repository.crud;

import com.ciclo4.reto2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
