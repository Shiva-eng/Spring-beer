package guru.springframework.mssc.brewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return beerService.getBeer(beerId);
		
	}
	
	
	
	

}
