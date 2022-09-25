package com.onlyxcodes.app.repository;


import org.springframework.data.repository.CrudRepository;

import com.onlyxcodes.app.model.User;



public interface UserRepository extends CrudRepository<User, Integer>{

}
