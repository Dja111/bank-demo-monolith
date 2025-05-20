package com.bankdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double amount;

    @Column(columnDefinition = "TEXT")
    private String reference;

    @Column(nullable = false, updatable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private String sourceAccountIban;

    @Column(nullable = false)
    private String targetAccountIban;

    @PrePersist
    protected void onCreate() {
        timestamp = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getSourceAccountIban() {
        return sourceAccountIban;
    }

    public void setSourceAccountIban(String sourceAccountIban) {
        this.sourceAccountIban = sourceAccountIban;
    }

    public String getTargetAccountIban() {
        return targetAccountIban;
    }

    public void setTargetAccountIban(String targetAccountIban) {
        this.targetAccountIban = targetAccountIban;
    }
}
