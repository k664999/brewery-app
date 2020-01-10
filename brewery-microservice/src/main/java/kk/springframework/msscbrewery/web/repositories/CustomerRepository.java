package kk.springframework.msscbrewery.web.repositories;

import kk.springframework.msscbrewery.web.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
