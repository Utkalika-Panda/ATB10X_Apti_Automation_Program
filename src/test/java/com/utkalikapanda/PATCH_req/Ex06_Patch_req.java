package com.utkalikapanda.PATCH_req;


import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Ex06_Patch_req {

    //Need path request
    //need payload
    //need token
    //Need booking id
    String payload = "{\n" +
            "    \"firstname\" : \"Jimutkalika\",\n" +
            "    \"lastname\" : \"Panda\"\n" +
            "}";
    String booking_id = "1";
    String token = "b414fa9cb9dd7ab";
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
@Test
@Description("Verify the Patch request and check the status code is 200 ok ")
    public void Patch_re_booking(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/" +booking_id);
        requestSpecification.body(payload).log().all();
        requestSpecification.cookie(token);
        requestSpecification.contentType(ContentType.JSON);

       Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);


    }

}
