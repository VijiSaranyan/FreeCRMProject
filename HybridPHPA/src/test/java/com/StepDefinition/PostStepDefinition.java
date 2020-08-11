package com.StepDefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_pojo_post;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostStepDefinition extends Utility {
	 RequestSpecification request ;
	 Response response;
	
	@Given("the User has PostMethod Details")
	public void the_user_has_post_method_details() throws IOException {
		SetValues_pojo_post s=new SetValues_pojo_post();
	    request =RestAssured.given().spec(requestdetails()).body(s.setvalues());
	}
				                                               

	@When("the User calls Post API with Post http methods")
	public void the_user_calls_post_api_with_post_http_methods() {
		
		 response=request.when().post("api/insert.php");
		
	}

	@Then("User Receives the Post StatusCode success")
	public void user_receives_the_post_status_code_success() {
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println(response.toString());

		
		
	}




}
