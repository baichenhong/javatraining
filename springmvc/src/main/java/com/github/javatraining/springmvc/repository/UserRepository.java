package com.github.javatraining.springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import com.github.javatraining.springmvc.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
