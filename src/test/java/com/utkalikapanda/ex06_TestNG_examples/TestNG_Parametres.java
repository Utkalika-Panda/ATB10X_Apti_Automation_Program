package com.utkalikapanda.ex06_TestNG_examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parametres {

    @Test()
    @Parameters("browser")
    public void Demo1(String value){
        System.out.println("Run Demo 1");

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Strat chrome browser");
        }
        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start firefox");
        }
    }
}
