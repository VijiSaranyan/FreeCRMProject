package com.StepDefinition;

import static org.junit.Assert.*;

import java.io.IOException;

import com.Data.Payloads_Details;
import com.Data.SetValues_pojo_delete;
import com.Data.SetValues_pojo_post;
import com.Data.SetValues_pojo_put;
import com.Util.APIResources;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Resuable_Post  extends Utility{
	RequestSpecification request;
	Response response;
	@Given("The User has APi method details")
	public void the_user_has_a_pi_method_details() throws IOException {
	    request =RestAssured.given().spec(requestdetails());
	}

	@When("The User uses {string} and {string}")
	public void the_user_uses_and(String resource, String method) {
		APIResources postresource=APIResources.valueOf(resource);
		
		//the body is declared for each method
		if (method.equalsIgnoreCase("post")) {
		SetValues_pojo_post	 p=new SetValues_pojo_post();
			response=request.body(p.setvalues()).when().post(postresource.getResource());
			
		}
		else if (method.equalsIgnoreCase("PUT"))
		{
			SetValues_pojo_put	 p=new SetValues_pojo_put();
			response=request.body(p.putvalues()).when().put(postresource.getResource());	
		}
		else if(method.equalsIgnoreCase("delete")){
			SetValues_pojo_delete	 p=new SetValues_pojo_delete();
			response=request.body(p.deletevalues()).when().delete(postresource.getResource());	
		}
		else if(method.equalsIgnoreCase("get")) {
			response=request.when().get(postresource.getResource());		
		}
		else if (method.equalsIgnoreCase("postpayload"))
		{
			Payloads_Details p=new Payloads_Details();
			response=request.body(p.postpayload()).when().post(postresource.getResource());	
		}
	    

	}

	@Then("the {string} in the response body is {string}")
	public void the_in_the_response_body_is(String keyvalue, String ExpectedValue) {
		String res=response.asString();
		System.out.println(res);
		JsonPath js=new JsonPath(res);
		assertEquals(js.get(keyvalue).toString(),ExpectedValue);

		
	}




}
