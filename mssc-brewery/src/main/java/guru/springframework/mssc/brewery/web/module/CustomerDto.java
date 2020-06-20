package guru.springframework.mssc.brewery.web.module;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
	
 private UUID customerId;
 
 private String customerName;
 
 private String customerType;

}
