package com.example.insurance.service;

import com.example.insurance.model.Insurance;
import com.example.insurance.model.Purchase;
import com.example.insurance.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public Purchase purchaseInsurance(Long insuranceId, Long userId) {
        Purchase purchase = new Purchase();
        purchase.setInsuranceId(insuranceId);
        purchase.setUserId(userId);
        return purchaseRepository.save(purchase);
    }
}