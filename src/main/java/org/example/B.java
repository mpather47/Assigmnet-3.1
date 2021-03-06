package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class B {
    private String className = "Base Class";

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @BeforeClass
    public static void beforeBaseClassMethod() {
        System.out.println("MyBaseClass: @BeforeClass static method invoked.");
    }

    @Before
    public void beforeBaseMethod() {
        System.out.println("MyBaseClass: @Before method invoked.");
    }

    @After
    public void afterBaseMethod() {
        System.out.println("MyBaseClass: @After method invoked.");
    }

    @Test
    public void testBaseMethod1() {
        System.out.println("MyBaseClass: in testMethod1()");
    }


}
