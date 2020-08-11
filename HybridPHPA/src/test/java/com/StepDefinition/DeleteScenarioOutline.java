package com.StepDefinition;

import java.io.IOException;

import com.Data.SetValues_pojo_delete;
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

public class DeleteScenarioOutline extends Utility{
	RequestSpecification request;
	Response response;
	Resource resource =new Resource();
	@Given("the user has delete method details  {string}")
	public void the_user_has_delete_method_details(String id) throws IOException {
        SetValues_pojo_delete sp=new SetValues_pojo_delete();
		request=RestAssured.given().spec(requestdetails()).body(sp.deletevalues(id));
		
	}

	@When("the user send delete HTTP request")
	public void the_user_send_delete_http_request() {
		response=request.when().delete(resource.getDeleteAPI());
	}

	@Then("user gets message data deleted successfully")
	public void user_gets_message_data_deleted_successfully() {
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println(response.asString());


	}




}
