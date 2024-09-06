package week2.week2day2Assignment;

import io.restassured.RestAssured;

public class UpdateExistingChangeRequest {

		public static void main(String[] args) {
			String url="https://dev268982.service-now.com/api/now/table/change_request/b2b5b86093245210b1ebf1ccebba10bd";
			String updatePayload="{\r\n"
					+ "    \"short_description\": \"home assignment week2 change request updated \",\r\n"
					+ "    \"description\": \"Update Change request for home assignment week2 day2 \"\r\n"
					+ "}";
		     RestAssured.given()
		                .auth()
		                .basic("admin", "zOKe9Wm/E4j%")
		                .header("Content-Type","application/json")
		                .log()
		                .all()
		                .when()
		                .body(updatePayload)
		                .put(url)	                
		                .then().log().all();

	}

}
