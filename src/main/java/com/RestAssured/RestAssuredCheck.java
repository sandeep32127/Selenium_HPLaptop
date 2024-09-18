package com.RestAssured;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredCheck {

	@Test
	public void checkAuthentication() {
		
		String auth = "Test:Test@123";
		byte[] authBytes = Base64.encodeBase64(auth.getBytes());
		
		String creds  = new String(authBytes);
		
		System.out.println("Base 64 format" + creds);

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";

		Response response = RestAssured.given()
				//.auth()
				//.basic("ToolsQA", "TestPassword")
				.when()
				.get();

		System.out.println("The response message is : "+response.jsonPath().prettify());

		System.out.println("The status code is : "+response.getStatusCode());

		JSONObject jsonObject = new JSONObject(response.getBody().asString());

		JSONArray jsonArray = jsonObject.getJSONArray("data");

		System.out.println(jsonArray);

		List<String> emailList = new ArrayList<String>();

		for (int i = 0; i < jsonArray.length(); i++) {
			String email = (String) jsonArray.getJSONObject(i).get("email");
			emailList.add(email);
		}

		System.out.println(emailList);


		String body = "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";

		Response postResponse = RestAssured.given()
				.body(body)
				.when()
				.post("https://reqres.in/api/users")
				.andReturn();

		System.out.println("The response message is : "+postResponse.jsonPath().prettify());

		System.out.println("The status code is : "+postResponse.getStatusCode());

		String  id = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post("https://reqres.in/api/users")
		.then().extract().path("id");
		
		System.out.println("The id is : "+id);
		
		String patchName = RestAssured.given()
		.contentType(ContentType.JSON.toString())
		.body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}")
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.extract()
		.path("name");

		System.out.println("The name is : "+patchName);
		
	}

}
