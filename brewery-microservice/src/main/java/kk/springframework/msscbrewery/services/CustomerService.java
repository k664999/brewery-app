package kk.springframework.msscbrewery.services;

import kk.springframework.msscbrewery.web.model.CustomerDto;


public interface CustomerService {
    CustomerDto getCustomerById(Long customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(Long customerId, CustomerDto customerDto);

    void deleteById(Long customerId);
}
