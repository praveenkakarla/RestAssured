package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TestOne {

	@Test
	public void test() {

		Response response = RestAssured.get("http://localhost:4547/Blog.Api/Customers");
		RestAssured.defaultParser = Parser.JSON;
		System.out.println("Status code = " + response.statusCode());
		System.out.println("Response Body is:" + response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		
	}

	@Test
	public void getResponseStatus() {

		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[0]",equalTo(1111));
		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[1]",equalTo(2222));
		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[2]",equalTo(3333));
		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[3]",equalTo(4444));
		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[4]",equalTo(5555));
		given().get("http://localhost:4547/Blog.Api/Customers").then().statusCode(404).body("data.id[5]",equalTo(6666));
	}
	
}
	