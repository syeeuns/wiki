package com.wiki.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WikiController {

  @GetMapping("/ping")
  public String healthCheck() {
    return "pong";
  }
}
