package com.hospital.controller;
import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins="*")
public class DoctorController {
 private final DoctorRepository repository;
 public DoctorController(DoctorRepository repository){this.repository=repository;}
 @GetMapping public List<Doctor> all(){return repository.findAll();}
 @GetMapping("/{id}") public Doctor one(@PathVariable Long id){return repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found"));}
 @PostMapping public Doctor create(@Valid @RequestBody Doctor item){item.setId(null);return repository.save(item);}
 @PutMapping("/{id}") public Doctor update(@PathVariable Long id,@Valid @RequestBody Doctor item){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");item.setId(id);return repository.save(item);}
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");repository.deleteById(id);}
}
