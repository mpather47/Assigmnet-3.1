package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class C extends B {

    private String className = "Sub Class";

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @BeforeClass
    public static void beforeSubClassMethod() {
        System.out.println("@BeforeClass static method invoked. MySubClass");
    }

    @Before
    public void beforeSubMethod() {
        System.out.println("MySubClass: @Before method invoked.");
    }

    @After
    public void afterSubMethod() {
        System.out.println("MySubClass: @After method invoked.");
    }

    @Test
    public void testMethod2() {
        System.out.println("MySubClass: in testMethod2().");
    }
}
