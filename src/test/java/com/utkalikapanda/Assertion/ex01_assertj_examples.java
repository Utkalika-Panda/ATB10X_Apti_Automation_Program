package com.utkalikapanda.Assertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.assertj.core.api.Assertions.*;

public class ex01_assertj_examples {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer booking_id;

    public void test_post(){

        String payload_post ="{\n" +
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
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload_post).log().all();

        response=r.when().post();
        vr = response.then().log().all();
        vr.statusCode(200);
        assertThat(booking_id).isNotNull().isNotZero().isPositive();
        assertThat(token).isNotNull().isNotEmpty();
    }


}
