package com.utkalikapanda.ex05_PUT_request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Put_req_Nonbdd_style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr ;
@Test
@Description("Verify the put request")
    public void put_request_resfullbooker(){
     String booking_id ="1226";
     String tooken = "37979146f64b968";
     String payload = "{\n" +
             "    \"firstname\" : \"Jimutkalika\",\n" +
             "    \n" +
             "    \"lastname\" : \"Brown\",\n" +
             "    \"totalprice\" : 111,\n" +
             "    \"depositpaid\" : true,\n" +
             "    \"bookingdates\" : {\n" +
             "        \"checkin\" : \"2018-01-01\",\n" +
             "        \"checkout\" : \"2019-01-01\"\n" +
             "    },\n" +
             "    \"additionalneeds\" : \"Breakfast\"\n" +
             "}";
        r = RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/booking/" + booking_id);
                r.contentType(ContentType.JSON);
                r.cookie("token",tooken);
                r.body(payload).log().all();

                response = r.when().put();
                vr = response.then().log().all().statusCode(200);
    }
}
