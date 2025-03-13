package com.utkalikapanda.ex01_RA_Basic;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {
        //Full url-https://api.zippopotam.us/in/560067
        //Base uri-https://api.zippopotam.us Main domain name
        //Base path - /in/560067
        RestAssured.
                given().
                baseUri("https://api.zippopotam.us")
                .basePath("/in/560067")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
