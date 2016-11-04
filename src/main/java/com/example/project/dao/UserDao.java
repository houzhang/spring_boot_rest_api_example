package com.example.project.dao;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.example.project.domain.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

}
