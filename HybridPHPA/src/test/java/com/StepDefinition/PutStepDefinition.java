package com.StepDefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Data.SetValues_pojo_put;
import com.Util.Resource;
import com.Util.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.Assert.assertEquals;

public class PutStepDefinition extends Utility{
	 RequestSpecification request ;
	 Response response;
	 Resource re=new Resource();
	 
	@Given("the User has PutMethod Details")
	public void the_user_has_put_method_details() throws IOException {
		SetValues_pojo_put put= new SetValues_pojo_put();
		//request=RestAssured.given().spec(requestdetails()).body(put.putvalues());
		request=RestAssured.given().basePath("https://www.change2testautomation.com:").body(put.putvalues());
	  
	}
		
	
	@When("the User calls Put API with Put http methods")
	public void the_user_calls_put_api_with_put_http_methods() 
	{
		response=request.when().put("/api/update.php");//using resource directly
		//response=request.when().put(re.getPutAPI());	//calling the method from another class resource 	
	}

	@Then("User receives message successfully updated")
	public void user_receives_message_successfully_updated() {
		Assert.assertEquals(response.asString(),   "{\"message\":\"Data Updated Successfully\"}");
	}



}
