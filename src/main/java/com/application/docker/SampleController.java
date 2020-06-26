package com.application.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SampleController {
  @GetMapping(path = "/sample/{name}")
  public ResponseEntity get(@PathVariable("name") final String name) {
    return ResponseEntity.ok("Hello " + name + " your'e calling me at " + new Date().toString());
  }
}
