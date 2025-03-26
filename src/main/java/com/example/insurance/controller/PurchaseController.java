package com.example.insurance.controller;

import com.example.insurance.model.Insurance;
import com.example.insurance.model.Purchase;
import com.example.insurance.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.core.io.*;
import java.io.IOException;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<String> purchaseInsurance(@RequestBody Purchase purchase) {
        System.out.println("Received purchase request: " + purchase);
        return ResponseEntity.ok("Purchase successful!");
    }
   

    @GetMapping("/download/{purchaseId}")
    public ResponseEntity<InputStreamResource> downloadPolicy(@PathVariable Long purchaseId) throws IOException {
        Resource pdfFile = new ClassPathResource("static/sample-policy.pdf");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdfFile.getInputStream()));
    }
    
    
    
}
