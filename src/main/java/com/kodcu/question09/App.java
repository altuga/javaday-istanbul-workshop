package com.kodcu.question09;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        System.out.println(p.end());
        end.setYear(78); // Modifies internals of p!
        System.out.println(p.end());
    }
}
