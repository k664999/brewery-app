package kk.springframework.msscbrewery.services;

import kk.springframework.msscbrewery.web.entities.CustomerEntity;
import kk.springframework.msscbrewery.web.mappers.CustomerMapper;
import kk.springframework.msscbrewery.web.model.CustomerDto;
import kk.springframework.msscbrewery.web.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerMapper customerMapper;
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto getCustomerById(Long customerId) {
        CustomerEntity customerEntity=customerRepository.findById(customerId).get();
        return customerMapper.customerEntityToCustomerDto(customerEntity);
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        customerRepository.save(customerMapper.customerDtoToCustomerEntity(customerDto));
        return customerDto;
    }

    @Override
    public void updateCustomer(Long customerId, CustomerDto customerDto) {
        CustomerEntity customerEntity;
        if(customerRepository.existsById(customerId)) {

            customerDto.setId(customerId);

            customerRepository.save(customerMapper.customerDtoToCustomerEntity(customerDto));
        }


    }

    @Override
    public void deleteById(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
