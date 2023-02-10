package com.spring.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;
public interface UserService{
     public ResponseEntity<String> signUp(Map<String,String> requestMap);
    public ResponseEntity<String> login(Map<String, String> requestMap);
}