package com.cs5308.demoapp;

import com.cs5308.demoapp.LameStringClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LameStringClass l = new LameStringClass();
        String concatenatedString = l.ConcatenateString("A", "B");
        System.out.println("Concatenated string = " + concatenatedString);
    }
}

