package guru.springframework.mssc.brewery.web.controller;

import java.util.UUID;

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

import guru.springframework.mssc.brewery.web.module.CustomerDto;
import guru.springframework.mssc.brewery.web.service.CustomerService;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
		CustomerDto customer = customerService.getCustomer(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);		
	}

	@PostMapping
	public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
		CustomerDto customer = customerService.createCustomer(customerDto);		
		return new ResponseEntity<CustomerDto>(customer, HttpStatus.CREATED);
	}

	@PutMapping({"/{customerId}"})
	public ResponseEntity updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {
		customerService.updateCustomer(customerId, customerDto);		
		return new ResponseEntity(HttpStatus.NO_CONTENT);

	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping({"/{customerId}"})
	public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCustomer(customerId);
	}

}
