package com.hospital.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity @Table(name="patients")
public class Patient {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @Email private String email;
 private String phone, gender, address;
 private Integer age;
 private LocalDateTime createdAt=LocalDateTime.now();
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getName(){return name;} public void setName(String name){this.name=name;}
 public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
 public String getPhone(){return phone;} public void setPhone(String phone){this.phone=phone;}
 public String getGender(){return gender;} public void setGender(String gender){this.gender=gender;}
 public String getAddress(){return address;} public void setAddress(String address){this.address=address;}
 public Integer getAge(){return age;} public void setAge(Integer age){this.age=age;}
 public LocalDateTime getCreatedAt(){return createdAt;} public void setCreatedAt(LocalDateTime v){createdAt=v;}
}
