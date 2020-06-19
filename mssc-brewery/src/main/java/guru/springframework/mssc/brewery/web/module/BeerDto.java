package guru.springframework.mssc.brewery.web.module;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	

	private String beerName;
	private UUID uid;
	private String beerStyle;
	private long upc;
	
	

}
