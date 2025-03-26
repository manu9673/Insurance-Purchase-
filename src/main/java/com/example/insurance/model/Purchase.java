package com.example.insurance.model;
import jakarta.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long insuranceId;
    private Long userId;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    //public Long getInsuranceId() { return insuranceId; }
    //public void setInsuranceId(Long insuranceId) { this.insuranceId = insuranceId; }
    //public Long getUserId() { return userId; }
    //public void setUserId(Long userId) { this.userId = userId; }
    
    public Long getInsuranceId() { return insuranceId; }
    public void setInsuranceId(Long insuranceId) { this.insuranceId = insuranceId; }
    
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}