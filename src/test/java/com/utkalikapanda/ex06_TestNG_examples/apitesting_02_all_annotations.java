package com.utkalikapanda.ex06_TestNG_examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class apitesting_02_all_annotations {

    //test put method
    //get token
    //get booking id
    //not test put method
    //close all
    @BeforeTest
    public void get_token(){
        System.out.println("token");
    }
    @BeforeTest()
    public void get_bookingid(){
        System.out.println("Booking id");
    }

    @Test(priority = 2)
    public void test_put() {
        System.out.println("2nd test");
    }
        @Test(priority = 1)
        public void test_put1(){
            System.out.println("1nd test");
    }
    @AfterTest
    public  void Closeall(){
        System.out.println("Close all");
    }
}
