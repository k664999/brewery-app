package kk.springframework.msscbrewery.services;

import kk.springframework.msscbrewery.web.model.BeerDto;


public interface BeerService {
    BeerDto getBeerById(Long beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(Long beerId, BeerDto beerDto);

    void deleteById(Long beerId);

    void sendBeersToQueue();

}
