package com.RestAssured;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class RestAssuredErgastCHeck {
	
	@Test
	public void ergastCheck() {
		
		//RestAssured.when().get("http://ergast.com/api/f1/2017/1.json").then().log().body();
		
		RestAssured.given().auth().basic("", "").
		when().
		get("http://ergast.com/api/f1/2017/1.json").then().log().body().
		assertThat().statusCode(200).and().
		body("MRData.RaceTable.Races.round", hasSize(1));
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://ergast.com/api/f1/2017/1.json");
		RequestSpecification build = builder.build();
		RequestSpecification spec = RestAssured.given().spec(build);
		spec.get().then().log().body();
	}

}
