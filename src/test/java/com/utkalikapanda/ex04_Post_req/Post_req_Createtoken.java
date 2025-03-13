package com.utkalikapanda.ex04_Post_req;


import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class Post_req_Createtoken {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description("Varify the posetive testvase for post request of create token")
public void pesetive_create_token_post(){

 String payload = "{\n" +
         "    \"username\" : \"admin\",\n" +
         "    \"password\" : \"password123\"\n" +
         "}";
 //Precondition
        r = RestAssured.given();
         r.baseUri("https://restful-booker.herokuapp.com");
         r.basePath("/auth");
         r.contentType(ContentType.JSON);
         r.body(payload);
//Making Https request
         response = r.when().log().all().post();
//Verification
         vr = response.then().log().all().statusCode(200);


}

}
