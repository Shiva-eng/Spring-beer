package guru.springframework.mssc.brewery.web.service;

import java.util.UUID;

import guru.springframework.mssc.brewery.web.module.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getCustomer(UUID customerId);
	
	public CustomerDto createCustomer(CustomerDto customerDto);
	
	public void updateCustomer(UUID customerId, CustomerDto customerDto);
	
	public void deleteCustomer(UUID customerId);
	
	

}
