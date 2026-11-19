package com.hospital.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
@Entity @Table(name="bills")
public class Bill {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotNull private Long patientId;
 @NotNull @DecimalMin("0.0") private BigDecimal amount;
 private String description;
 private String paymentStatus="UNPAID";
 private LocalDate billDate=LocalDate.now();
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public Long getPatientId(){return patientId;} public void setPatientId(Long v){patientId=v;}
 public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal v){amount=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getPaymentStatus(){return paymentStatus;} public void setPaymentStatus(String v){paymentStatus=v;}
 public LocalDate getBillDate(){return billDate;} public void setBillDate(LocalDate v){billDate=v;}
}
