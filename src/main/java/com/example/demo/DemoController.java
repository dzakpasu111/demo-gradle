package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="all")
public class DemoController {

    @GetMapping(name = "/ok")
    public ResponseEntity<String> getAll(){
        return ResponseEntity.ok("it is Ok");
    }
}
