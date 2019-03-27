package com.adriano.foobar;

/**
 * @author: Adrian Osorio (jadrian.osoriop@gmail.com)
 * @version 1.0
 */
public class App 
{

    public static void main( String[] args )
    {
        StringBuilder output = new StringBuilder();
        for(int i = 1 ; i <= 100 ; i++) {
            output.append(FooBarAnalyzer.isFooBarOrNumber(i)).append(", ");
        }
        System.out.println(output.toString());
    }

}