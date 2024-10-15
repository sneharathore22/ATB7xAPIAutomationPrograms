package com.thetestingacademy.ex_1410;

import org.testng.annotations.Test;

public class TestNG004 {


    @Test
    public void serverStartedOk(){
        System.out.println("I will run first");
    }


    @Test(dependsOnMethods = "serverStartedOk")
    public void method1(){
        System.out.println("method1");
    }
}
