package com.adriano.foobar;

/**
 * @author: Adrian Osorio (jadrian.osoriop@gmail.com)
 * @version 1.0
 */
public class FooBarAnalyzer 
{
    /**
    *   Checks the given number and return a string value based on the following rules
    *   - for multiples of 3 returns "Foo"
    *   - for multiples of 5 returns "Bar"
    *   - for multiples of both 3 and 5 returns "FooBar"
    *   - numbers not multiples of 3 or 5 returns the number
    *
    * @param number The number to analyze
    * @return result 
    */
    public static String isFooBarOrNumber(int number) {
        String[] words = {"FooBar", "Bar", "Foo"};
        String result = String.valueOf(number);
        // Here is the magic, Math.min will resolve to 0 when number is multiple of 3 or 5, otherwise, it will resolve to 1
        int index = Math.min(number % 3, 1) + Math.min(number % 5, 1) * 2;       
        if (index < words.length) {
            result = words[index];
        }
        return result;
    }
}