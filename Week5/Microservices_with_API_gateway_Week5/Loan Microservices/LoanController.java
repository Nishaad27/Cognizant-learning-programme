package com.cognizant.loan.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public ResponseEntity<Map<String, Object>> getLoan(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", "H00987987972342");
        response.put("type", "car");
        response.put("loan", 400000);
        response.put("emi", 3258);
        response.put("tenure", 18);
        return ResponseEntity.ok(response);
    }
}
