package com.example.SpringBoot.service;

import com.example.SpringBoot.model.Customer;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class CustomerServiceImp implements CustomerService {

    private final Faker faker = new Faker();

    private final List<Customer> customersFakes = faker.collection(
                    () -> new Customer(faker.number().randomNumber(),
                            faker.name().fullName(),
                            faker.internet().username(),
                            faker.internet().password()))
            .maxLen(5)
            .generate();


    @Override
    public Customer getFake() {
        return new Customer(faker.number().randomNumber(),
                            faker.name().fullName(),
                            faker.internet().username(),
                            faker.internet().password());

    }

    @Override
    public List<Customer> getFakes() {
        return Stream.generate(this::getFake)
                .limit(10)
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAllFakes() {
        return customersFakes;
    }

    @Override
    public Optional<Customer> findFakeById(long id) {
        return customersFakes.stream().filter(customer -> customer.getId().equals(id)).findAny();
    }

    @Override
    public Optional<Customer> findFakeByName(String name) {
        return customersFakes.stream().filter(customer -> name.contentEquals(customer.getName())).findAny();
    }

    @Override
    public void createFake(Customer fakeCustomer) {
        customersFakes.add(fakeCustomer);
    }

    @Override
    public void modifyFake(Customer fakeCustomer) {
        IntStream.range(0, customersFakes.size())
                 .filter(i -> fakeCustomer.getId().equals(customersFakes.get(i).getId()))
                 .findFirst()
                 .ifPresent(i -> customersFakes.set(i, fakeCustomer));
    }

    @Override
    public boolean deleteFake(long id) {
        for (Customer customerFake : customersFakes) {
            if (customerFake.getId().equals(id)) {
                return customersFakes.remove(customerFake);
            }
        }
        return false;
    }

}
