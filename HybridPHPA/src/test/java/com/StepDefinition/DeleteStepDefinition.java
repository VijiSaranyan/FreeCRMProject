package com.StepDefinition;

import java.io.IOException;

import com.Data.SetValues_pojo_delete;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DeleteStepDefinition extends Utility{
	RequestSpecification request;
	Response response;
	
	@Given("the user has delete method details")
	public void the_user_has_delete_method_details() throws IOException {
		SetValues_pojo_delete del=new SetValues_pojo_delete();
		request=RestAssured.given().spec(requestdetails()).body(del.deletevalues());
		
	}

	@When("the user call delete API with delete HTTP method")
	public void the_user_call_delete_api_with_delete_http_method() {
		response=request.when().delete("/api/delete.php");
		
	}

	@Then("the user receive delete status code success")
	public void the_user_receive_delete_status_code_success() {
		Assert.assertEquals(response.asString(),  "{\"message\":\"Post Deleted Successfully\"}");  
		System.out.println(response.asString());

	}




}
