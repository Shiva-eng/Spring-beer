package guru.springframework.mssc.brewery.web.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import guru.springframework.mssc.brewery.web.module.BeerDto;
import lombok.extern.java.Log;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public ResponseEntity<BeerDto> getBeer(UUID beerId) {
	
		return new ResponseEntity<BeerDto>(BeerDto.builder()
				.uid(UUID.randomUUID())
				.beerName("King fisher")
				.beerStyle("Strong")
				.build(), HttpStatus.OK);
		
	}

	@Override
	public BeerDto createBear(BeerDto beerDto) {
		return BeerDto.builder()
				.uid(UUID.randomUUID())
				.beerName("New King fisher")
				.beerStyle("Very Strong")
				.build();
	}

	@Override
	public void  updateBeer(UUID uid, BeerDto beerDto) {
		 new ResponseEntity<BeerDto>(BeerDto.builder()
				.uid(UUID.randomUUID())
				.beerName("New King fisher")
				.beerStyle("Very Strong")
				.build(), HttpStatus.CREATED);
	}

	@Override
	public void deleteBeer(UUID beerId) {
		System.out.println("deleting .........");
	}

}
