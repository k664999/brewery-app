package kk.springframework.msscbrewery.services;


import kk.springframework.msscbrewery.web.entities.BeerEntity;
import kk.springframework.msscbrewery.web.mappers.BeerMapper;
import kk.springframework.msscbrewery.web.model.BeerDto;
import kk.springframework.msscbrewery.web.publisher.Publisher;
import kk.springframework.msscbrewery.web.repositories.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service

public class BeerServiceImpl implements BeerService {

    private final BeerMapper beerMapper;
    private final BeerRepository beerRepository;

    public BeerServiceImpl(BeerMapper beerMapper, BeerRepository beerRepository) {
        this.beerMapper = beerMapper;
        this.beerRepository = beerRepository;
    }


    @Override
    public BeerDto getBeerById(Long beerId) {

        BeerEntity beerEntity = beerRepository.findById(beerId).get();
        return beerMapper.beerToBeerDto(beerEntity);
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        beerRepository.save(beerMapper.beerDtoToBeerEntity(beerDto));
        return beerDto;
    }

    @Override
    public void updateBeer(Long beerId, BeerDto beerDto) {

        beerDto.setId(beerId);
        beerRepository.save(beerMapper.beerDtoToBeerEntity(beerDto));

    }

    @Override
    public void deleteById(Long beerId) {
        log.debug("Deleting a beer...");
        beerRepository.deleteById(beerId);
    }
    @Override
    public void sendBeersToQueue() {
        try {
            Publisher.sendToQueue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
