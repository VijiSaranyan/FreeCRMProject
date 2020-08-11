package com.StepDefinition;

import java.io.IOException;

import com.Data.SetValues_pojo_post;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class PostScenarioOutline extends Utility{
	RequestSpecification request;
	Response response;
	@Given("the user has post method details {string} {string} {string}")
	public void the_user_has_post_method_details(String title, String body, String author) throws IOException {
		SetValues_pojo_post s=new SetValues_pojo_post();
	    request =RestAssured.given().spec(requestdetails()).body(s.setvalues_post(title, body, author));
		
	}

	@When("the user send post HTTP request")
	public void the_user_send_post_http_request() {
		response=request.when().post("/api/insert.php");
		
		
	}

	@SuppressWarnings("deprecation")
	@Then("user gets message data inserted succesfully")
	public void user_gets_message_data_inserted_succesfully() {
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println(response.asString());

	    
	}



}
