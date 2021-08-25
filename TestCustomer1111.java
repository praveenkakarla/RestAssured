package Demo;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TestCustomer1111{

	@Test
	public void test1() {

		Response response = RestAssured.get("http://localhost:4547/Blog.Api/1111/CustomerView");
		System.out.println("Status code = " + response.statusCode());
		System.out.println("Response Body is:" + response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);

	}
	@Test
	public void getResponseStatus() {

		given().get("http://localhost:4547/Blog.Api/1111/CustomerView").then().statusCode(200).body("data.customerID",equalTo("1111"));
	}
	
}
	