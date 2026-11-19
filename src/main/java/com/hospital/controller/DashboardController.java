package com.hospital.controller;
import com.hospital.repository.*;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController @RequestMapping("/api/dashboard") @CrossOrigin(origins="*")
public class DashboardController {
 private final PatientRepository patients; private final DoctorRepository doctors;
 private final AppointmentRepository appointments; private final BillRepository bills;
 public DashboardController(PatientRepository p,DoctorRepository d,AppointmentRepository a,BillRepository b){patients=p;doctors=d;appointments=a;bills=b;}
 @GetMapping public Map<String,Long> stats(){return Map.of("patients",patients.count(),"doctors",doctors.count(),"appointments",appointments.count(),"bills",bills.count());}
}
