package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.GetLocation;

public class TestDataBuild {
	
	public AddPlace AddPlacePayLoad(String name, String language, String address)
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		
		
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsites("http://google.com");
		List<String> Ltypes = new ArrayList<String>();
		Ltypes.add("shoe park");
		Ltypes.add("shop");
		p.setTypes(Ltypes);
		
		//set location is expexting class as return type
		//hence create class for location and set values for lat and lng
		//then pass in method p.setLocation();
		GetLocation l = new GetLocation();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}
	
	public String DeletePlacePayload(String placeId)
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}

}
