
package com.StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetStepDefinition extends Utility {
	RequestSpecification request;
	Response response;
	
	
	@Given("the User has GetMethod Details")
	public void the_user_has_get_method_details() throws Exception {
		request=RestAssured.given().baseUri("https://www.change2testautomation.com/")
				.header("Content-Type","appilcation/json").spec(requestdetails());
		
	}

	@When("the USer calls Get API with Get http methods")
	public void the_u_ser_calls_get_api_with_get_http_methods() {
		response=request.when().get("/api/read.php");
		
	}
	@Then("user receives message updated successfully")
	public void user_receives_message_updated_successfully() {
		Assert.assertEquals(response.getSessionId(), 200);
		System.out.println(response.asString());

	}


	


}
