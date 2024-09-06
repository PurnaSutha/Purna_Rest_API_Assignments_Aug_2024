package week2.week2day2Assignment;

import io.restassured.RestAssured;

public class CreateChangeRequest { //POST

	public static void main(String[] args) {
		String url="https://dev268982.service-now.com/api/now/table/change_request";
		String requestPayload="{\r\n"
				+ "    \"short_description\": \"home assignment week2\",\r\n"
				+ "    \"description\": \"New Change request for home assignment week2 day2\"\r\n"
				+ "}";
	     RestAssured.given()
	                .auth()
	                .basic("admin", "zOKe9Wm/E4j%")
	                .header("Content-Type","application/json")
	                .log()
	                .all()
	                .when()
	                .body(requestPayload)
	                .post(url)	                
	                .then().log().all();

	}

}
