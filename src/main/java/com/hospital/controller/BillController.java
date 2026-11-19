package com.hospital.controller;
import com.hospital.entity.Bill;
import com.hospital.repository.BillRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("/api/bills")
@CrossOrigin(origins="*")
public class BillController {
 private final BillRepository repository;
 public BillController(BillRepository repository){this.repository=repository;}
 @GetMapping public List<Bill> all(){return repository.findAll();}
 @GetMapping("/{id}") public Bill one(@PathVariable Long id){return repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found"));}
 @PostMapping public Bill create(@Valid @RequestBody Bill item){item.setId(null);return repository.save(item);}
 @PutMapping("/{id}") public Bill update(@PathVariable Long id,@Valid @RequestBody Bill item){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");item.setId(id);return repository.save(item);}
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Record not found");repository.deleteById(id);}
}
