package com.didierlemus.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.didierlemus.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    


}
