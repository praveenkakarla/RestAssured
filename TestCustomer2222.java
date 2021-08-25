package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class TestCustomer2222{

	@Test
	public void test2() {

		Response response = RestAssured.get("http://localhost:4547/Blog.Api/2222/CustomerView");
		System.out.println("Status code = " + response.statusCode());
		System.out.println("Response Body is:" + response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);

	}
	@Test
	public void getResponseStatus() {

		given().get("http://localhost:4547/Blog.Api/2222/CustomerView").then().statusCode(200).body("data.customerID",equalTo("2222"));
	}
	
}
	