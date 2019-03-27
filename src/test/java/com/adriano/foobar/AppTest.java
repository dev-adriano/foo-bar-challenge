package com.adriano.foobar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Some test for the @FooBarAnalyzer class and its isFooBarOrNumber method
 * @author: Adrian Osorio (jadrian.osoriop@gmail.com)
 * @version 1.0
 */
public class AppTest 
{

    private final static String FOO = "Foo";
    private final static String BAR = "Bar";
    private final static String FOO_BAR = "FooBar";


    @BeforeAll
    static void setup(){
       System.out.println("Starting Tests");
    }

    @Test
    public void testFoo()
    {
        System.out.println("Testing Foo");
        Assertions.assertEquals(FOO, FooBarAnalyzer.isFooBarOrNumber(9)); 
    }

    @Test
    public void testBar()
    {
        System.out.println("Testing Bar");
        Assertions.assertEquals(BAR, FooBarAnalyzer.isFooBarOrNumber(10)); 
    }

    @Test
    public void testFooBar()
    {
        System.out.println("Testing FooBar");
        Assertions.assertEquals(FOO_BAR, FooBarAnalyzer.isFooBarOrNumber(15)); 
    }

    @Test
    public void testNumber()
    {
        System.out.println("Testing Number");
        int number = 22;
        Assertions.assertEquals(FooBarAnalyzer.isFooBarOrNumber(number), String.valueOf(number)); 
    }

    @AfterAll
    static void finish(){
       System.out.println("Tests finished!");
    }

}
