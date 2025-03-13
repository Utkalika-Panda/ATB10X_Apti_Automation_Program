package com.utkalikapanda.ex01_RA_Basic;

import io.restassured.RestAssured;

public class APItesting_multiple_tc {
    public static void main(String[] args) {
        String pincode = "560067";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode).
                when().get()
                .then().log().all().statusCode(200);

         pincode = "-1";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode).
                when().get()
                .then().log().all().statusCode(200);

         pincode = " ";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode).
                when().get()
                .then().log().all().statusCode(200);
    }
}
