package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class SpaceXapiTest {

	@Test(priority = 2)
	public void getStatusCode() {

		given()
		.when()
		.get("https://api.spacexdata.com/v4/launches/latest")

		.then()
		.statusCode(200);
	}

	@Test(priority = 3)
	public void getSpecificIdLaunchDetail() {

		given()
		.when()
		.get("https://api.spacexdata.com/v4/launches/5eb87d46ffd86e000604b388")

		.then()
		.statusCode(200)
		.log().body()
		.body("id", equalTo("5eb87d46ffd86e000604b388"));
	}

}
