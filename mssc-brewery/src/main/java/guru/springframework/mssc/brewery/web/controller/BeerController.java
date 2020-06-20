package guru.springframework.mssc.brewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.mssc.brewery.web.module.BeerDto;
import guru.springframework.mssc.brewery.web.service.BeerService;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
	

	private final BeerService beerService;
	
	public BeerController(BeerService beerService){
		this.beerService = beerService;
	}
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return beerService.getBeer(beerId);
		
	}
	
	@PostMapping
	public ResponseEntity<BeerDto> createBear(@RequestBody BeerDto beerDto){
		BeerDto beerDto2 = beerService.createBear(beerDto);
		
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.add("Location", "api/v1/beer"+ beerDto2.getUid().toString());
		
		return new ResponseEntity<BeerDto>(httpHeader, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{beerId}"})
	public ResponseEntity updateBear(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
		 beerService.updateBeer(beerId, beerDto);
		 return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBear(@PathVariable("beerId") UUID beerId){
		 beerService.deleteBeer(beerId);
	}
	
	
	
	

}
