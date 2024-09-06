package com.example.SpringBoot.service;

import com.example.SpringBoot.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer getFake();
    List<Customer> getFakes();
    List<Customer> findAllFakes();
    Optional<Customer> findFakeById(long id);
    Optional<Customer> findFakeByName(String name);
    void createFake(Customer fakeCustomer);
    void modifyFake(Customer fakeCustomer);
    boolean deleteFake(long id);
}
