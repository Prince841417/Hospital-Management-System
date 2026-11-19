package com.hospital.controller;
import com.hospital.entity.Appointment;
import com.hospital.repository.AppointmentRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins="*")
public class AppointmentController {
 private final AppointmentRepository repository;
 public AppointmentController(AppointmentRepository repository){this.repository=repository;}
 @GetMapping public List<Appointment> all(){return repository.findAll();}
 @GetMapping("/{id}") public Appointment one(@PathVariable Long id){return repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found"));}
 @PostMapping public Appointment create(@Valid @RequestBody Appointment item){item.setId(null);return repository.save(item);}
 @PutMapping("/{id}") public Appointment update(@PathVariable Long id,@Valid @RequestBody Appointment item){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");item.setId(id);return repository.save(item);}
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");repository.deleteById(id);}
}
