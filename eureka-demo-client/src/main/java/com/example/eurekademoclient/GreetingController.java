package com.example.eurekademoclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {

  @RequestMapping("/greeting")
  String greeting();

}
