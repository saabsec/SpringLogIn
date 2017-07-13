package com.beta.firstlogin.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringResources {
  
  @RequestMapping("/api/v1/resource")
  public Map<String, Object> home() {
    Map<String, Object> model = new HashMap<>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    for (int i = 0; i < 100; i++) {
      model.put(String.valueOf(i), UUID.randomUUID().toString());
    }
    return model;
  }
}
