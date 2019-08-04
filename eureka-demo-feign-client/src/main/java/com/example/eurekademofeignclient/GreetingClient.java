package com.example.eurekademofeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-demo-client")
public interface GreetingClient {

  @RequestMapping("/greeting")
  String greeting();

}
