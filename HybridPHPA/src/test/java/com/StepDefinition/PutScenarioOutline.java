package com.StepDefinition;

import java.io.IOException;

import org.junit.runner.Request;

import com.Data.SetValues_pojo_put;
import com.Util.Resource;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutScenarioOutline extends Utility{
	RequestSpecification request;
	Response response;
	Resource resource;
	@Given("the user has put method details  {string} {string}")
	public void the_user_has_put_method_details(String id, String author) throws IOException {
		SetValues_pojo_put sp=new SetValues_pojo_put();
		request=RestAssured.given().spec(requestdetails()).body(sp.putvalues(id, author));
		
	}

	@When("the user send put HTTP request")
	public void the_user_send_put_http_request() {
		resource=new Resource();
		response=request.when().put(resource.getPutAPI());
	}

	@Then("user gets message data updated successfully")
	public void user_gets_message_data_updated_successfully() {
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.asString());
	}




}
