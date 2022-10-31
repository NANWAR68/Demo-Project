package Demo.apiRestAssured;

import java.io.File;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class EmployeeInfoAPISteps {

	@Given("^Create Employee details$")
	public void create_Employee_details() throws Throwable {
		File payload= new File(System.getProperty("user.dir")+ "/src/test/resource/DemoApiPayload/NewEmployeeInfo.json");
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		request.body(payload);
		Response resp = RestAssured.post("http://dummy.restapiexample.com/api/v1/create");
		int statusCode = resp.statusCode();
		Assert.assertEquals(200, statusCode);
		
	    String responseBody = resp.asString();
        Assert.assertFalse(responseBody.isEmpty());
	   System.out.println("Status Code :" + statusCode);
	   System.out.println("Response Body: " +   responseBody);
		
	   
	}

	@When("^Get all employee record details$")
	public void get_all_employee_record_details() throws Throwable {
		
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		int statusCode = resp.statusCode();
		Assert.assertEquals(200, statusCode);
		
	    String responseBody = resp.asString();
        Assert.assertFalse(responseBody.isEmpty());
	   System.out.println("Status Code :" + statusCode);
	   System.out.println("Response Body: " +   responseBody);
	}

	@Then("^Get single employee record details$")
	public void get_single_employee_record_details() throws Throwable {
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/2");
		int statusCode = resp.statusCode();
		Assert.assertEquals(200, statusCode);
		
	    String responseBody = resp.asString();
        Assert.assertFalse(responseBody.isEmpty());
	   System.out.println("Status Code :" + statusCode);
	   System.out.println("Response Body: " +   responseBody);
	    
	}


}
