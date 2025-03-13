package com.utkalikapanda.ex02_RA;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_TestNG {

    @Test
    @Description(" TC#1-->Verify the positive testcase and valid status code is 200 ok")
    public void test_GET_positive_TC1(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/560067")
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    @Description(" TC#2-->Verify the Negative testcase and it will give you error")
    public void test_GET_Nagative_TC2(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+"-1")
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    @Description(" TC#3-->Verify the Negative testcase and it will give you error")
    public void test_GET_positive_TC3(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+" ")
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    @Description(" TC#4-->Verify the Negative testcase and it will give you error")
    public void test_GET_positive_TC4(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+"@")
                .when().get()
                .then().log().all().statusCode(200);
    }
}
