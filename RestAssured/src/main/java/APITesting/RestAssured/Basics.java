package APITesting.RestAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		System.out.println("test");
		//Validate Add API is working as expected
		//Rest Assured works using 3 methods/principles:
		//given-> all input details
		//when-> Submit the API -resource and HTTP method
		//Then-> validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline123 house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 1247\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 007\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop123\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "").when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200);
		
		System.out.println("test complete");
	}

}
