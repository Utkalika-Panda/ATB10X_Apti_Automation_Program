package com.utkalikapanda.ex06_TestNG_examples;

import org.testng.annotations.Test;

public class Dependsupon_method {

    @Test(dependsOnMethods = "test_login_of_user")
    public void test_internet_is_ok(){
        System.out.println("Internet is ok");
    }
    @Test(dependsOnMethods = "test_login_of_user")
    public void test_url_correct(){
        System.out.println("url_correct");
    }
    @Test(dependsOnMethods = "test_login_of_user")
    public void test_Registration_done(){
        System.out.println("Registration done");
    }
    @Test
    public void test_login_of_user(){
        System.out.println("log in successful");
    }

}
