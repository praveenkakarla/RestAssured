package Demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestCustomer3333{

	@Test
	public void test3() {

		Response response = RestAssured.get("http://localhost:4547/Blog.Api/3333/CustomerView");
		System.out.println("Status code = " + response.statusCode());
		System.out.println("Response Body is:" + response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);

	}
	@Test
	public void getResponseStatus() {

		given().get("http://localhost:4547/Blog.Api/3333/CustomerView").then().statusCode(200).body("data.customerID",equalTo("3333"));
	}
	
}