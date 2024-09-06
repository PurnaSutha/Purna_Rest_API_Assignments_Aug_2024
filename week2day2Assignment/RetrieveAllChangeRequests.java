package week2.week2day2Assignment;

import io.restassured.RestAssured;

public class RetrieveAllChangeRequests {

	public static void main(String[] args) {
	 String url="https://dev268982.service-now.com/api/now/table/change_request"; 
     RestAssured.given()
                .auth()
                .basic("admin", "zOKe9Wm/E4j%")
                .log()
                .all()
                .when()
                .get(url)
                .then().log().all();
                
	}

}
