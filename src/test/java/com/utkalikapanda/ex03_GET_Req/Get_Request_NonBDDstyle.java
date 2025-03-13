package com.utkalikapanda.ex03_GET_Req;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_Request_NonBDDstyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description("TC#1-->Run the positive testcase")
    public void Positve_testcase_nonBDDStryle(){
        String pincode ="560067";
        r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/in/"+"pincode");

            response = r.when().log().all().get();

            vr = response.then().log().all().statusCode(200);

    }
    @Test
    @Description("TC#2-->Run the Nagative testcase")
    public void Negative_testcase_nonBDDStryle(){
        String pincode ="560067";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/in/"+pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(404);

    }
}
