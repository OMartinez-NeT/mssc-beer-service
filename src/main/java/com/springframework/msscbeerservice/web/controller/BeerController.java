package com.springframework.msscbeerservice.web.controller;

import com.springframework.msscbeerservice.web.model.BeerDto;
import com.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId){

        //todo impl
        return new ResponseEntity<>(BeerDto.builder().
                id(UUID.randomUUID())
                .beerName("Whatever")
                .beerStyle(BeerStyleEnum.LAGER).build(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<BeerDto> createBeer(@RequestBody BeerDto beerDto){

        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable UUID beerId){

        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity<BeerDto> deleteBeer(@PathVariable UUID beerId){
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
