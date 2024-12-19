package com.college.store.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.college.store.model.User;

@Repository
public interface UserRepository extends ListCrudRepository<User, Integer>{

    public Optional<User> findByUsername(String username);

    public Optional<User> findByEmail(String email);
}
