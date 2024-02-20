package com.mhpeash.api.restapi.repository;

import com.mhpeash.api.restapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

