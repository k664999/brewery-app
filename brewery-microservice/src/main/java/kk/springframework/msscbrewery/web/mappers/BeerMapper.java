package kk.springframework.msscbrewery.web.mappers;

import kk.springframework.msscbrewery.web.entities.BeerEntity;
import kk.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(BeerEntity beerEntity);
    BeerEntity beerDtoToBeerEntity(BeerDto beerDto);

}
