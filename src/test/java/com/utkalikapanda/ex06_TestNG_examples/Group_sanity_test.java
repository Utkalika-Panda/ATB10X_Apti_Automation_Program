package com.utkalikapanda.ex06_TestNG_examples;

import org.testng.annotations.Test;

public class Group_sanity_test {

    @Test(groups = {"Sanity", "Regression"})
    public void test_regression(){
        System.out.println("Run regression tescase");

    }

    @Test(groups = {"P1", "Regression"})
    public void test_Sanity(){
        System.out.println("Run sanity tescase");

    }

    @Test(groups = {"P1", "QA"})
    public void test_Smoke(){
        System.out.println("Run smoak tescase");

    }
}
