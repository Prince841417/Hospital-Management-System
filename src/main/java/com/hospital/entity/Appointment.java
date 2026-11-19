package com.hospital.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity @Table(name="appointments")
public class Appointment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotNull private Long patientId;
 @NotNull private Long doctorId;
 @NotNull private LocalDateTime appointmentDate;
 private String reason;
 private String status="BOOKED";
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public Long getPatientId(){return patientId;} public void setPatientId(Long v){patientId=v;}
 public Long getDoctorId(){return doctorId;} public void setDoctorId(Long v){doctorId=v;}
 public LocalDateTime getAppointmentDate(){return appointmentDate;} public void setAppointmentDate(LocalDateTime v){appointmentDate=v;}
 public String getReason(){return reason;} public void setReason(String v){reason=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
