package com.example.SpringBoot.controllers;

import com.example.SpringBoot.model.Customer;
import com.example.SpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/fake")
    public Customer getFakeCustomer() {
        return customerService.getFake();
    }

    @GetMapping("/fakes")
    public List<Customer> getFakesCustomers() {
        return customerService.getFakes();
    }

    @GetMapping("/fakes/findAll")
    public List<Customer> findAllFakes() {
        return customerService.findAllFakes();
    }

    @GetMapping("/fakes/findById/{id}")
    public Optional<Customer> findFakeById(@PathVariable long id) {
        return customerService.findFakeById(id);
    }

    @GetMapping("/fakes/findByName/{name}")
    public Optional<Customer> findFakeByName(@PathVariable String name) {
        return customerService.findFakeByName(name);
    }

    @PostMapping("/fakes")
    public Customer createFake(@RequestBody Customer fakeCustomer) {
        customerService.createFake(fakeCustomer);
        return fakeCustomer;
    }

    @PutMapping("/fakes")
    public Customer modifyFake(@RequestBody Customer fakeCustomer) {
        customerService.modifyFake(fakeCustomer);
        return fakeCustomer;
    }

    @DeleteMapping("/fakes/{id}")
    public boolean deleteFake(@PathVariable long id) {
        return customerService.deleteFake(id);
    }
}
