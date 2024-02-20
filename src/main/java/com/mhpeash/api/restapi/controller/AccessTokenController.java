package com.mhpeash.api.restapi.controller;


import com.mhpeash.api.restapi.Entity.AccessToken;
import com.mhpeash.api.restapi.Entity.User;
import com.mhpeash.api.restapi.exception.ResourceNotFoundException;
import com.mhpeash.api.restapi.repository.AccessTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class AccessTokenController {

    @Autowired
    private AccessTokenRepository accessTokenRepository;


    @PostMapping("/saveToken")
    public AccessToken generateToken(@RequestBody AccessToken token) {
        return accessTokenRepository.save(token);
    }

    @GetMapping("/getAllToken")
    public List<AccessToken> getAllToken() {
        return accessTokenRepository.findAll();
    }
//    @Query(value = "select * from accesstoken where id=(select max(id) from accesstoken)", nativeQuery = true)
//    public AccessToken getLastToken() {
//        AccessToken token = accessTokenRepository.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
//        return ResponseEntity.ok(user);
//    }



}
