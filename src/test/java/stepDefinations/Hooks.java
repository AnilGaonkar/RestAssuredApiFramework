package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//write a code that will give you placeID
		//execute this code only when place id is null
		
		StepDefination sd = new StepDefination();
		if(StepDefination.place_id==null)    //can be called by sd.place_id but will give warning as it is static
		{
		sd.add_place_payload_with("Anil", "deutsch", "germany");
		sd.user_calls_with_http_request("AddPlaceAPI", "POST");
		sd.verify_place_id_created_maps_to_using("Anil", "getPlaceAPI");
		}
	}
}
