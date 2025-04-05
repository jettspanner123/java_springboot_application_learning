package com.uddeshyaSingh.MyFirstApplciation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController @RequestMapping("/health") public class HealthCheck {

    @GetMapping("check_health")
    public String CheckHealth() {
        return "Health Check: Ok";
    }
}
