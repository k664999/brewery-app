package kk.springframework.msscbrewery.web.mappers;

import kk.springframework.msscbrewery.web.entities.CustomerEntity;
import kk.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerEntityToCustomerDto(CustomerEntity customerEntity);
    CustomerEntity customerDtoToCustomerEntity(CustomerDto customerDto);

}
