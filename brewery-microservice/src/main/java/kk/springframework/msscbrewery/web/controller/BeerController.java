package kk.springframework.msscbrewery.web.controller;

import kk.springframework.msscbrewery.services.BeerService;
import kk.springframework.msscbrewery.web.model.BeerDto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@Valid @PathVariable("beerId") Long beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }



    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDto beerDto){

        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @GetMapping({"/beersToQueue"})
    public ResponseEntity<BeerDto> beersToQueue(){

        beerService.sendBeersToQueue();
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@Valid @PathVariable("beerId") Long beerId, @Valid @RequestBody BeerDto beerDto){

        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@Valid @PathVariable("beerId") Long beerId){
        beerService.deleteById(beerId);
    }

}
