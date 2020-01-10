package kk.springframework.msscbrewery.web.repositories;


import kk.springframework.msscbrewery.web.entities.BeerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BeerRepository extends JpaRepository<BeerEntity, Long> {


}
