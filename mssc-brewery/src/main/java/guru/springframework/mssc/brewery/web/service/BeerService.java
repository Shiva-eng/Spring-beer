package guru.springframework.mssc.brewery.web.service;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

import guru.springframework.mssc.brewery.web.module.BeerDto;

public interface BeerService {
	
	public ResponseEntity<BeerDto> getBeer(UUID beerId);

}
