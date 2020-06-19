package guru.springframework.mssc.brewery.web.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import guru.springframework.mssc.brewery.web.module.BeerDto;

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

}
