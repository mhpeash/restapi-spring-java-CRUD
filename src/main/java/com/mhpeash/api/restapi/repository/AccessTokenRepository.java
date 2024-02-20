package com.mhpeash.api.restapi.repository;

import com.mhpeash.api.restapi.Entity.AccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessTokenRepository extends JpaRepository<AccessToken, Long> {
}
