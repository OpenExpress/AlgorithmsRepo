package com.thirity.day.challenge;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Basic005 {
//	https://www.hackerrank.com/challenges/time-conversion/problem
		

//Points: 55Rank: 470040
    static String timeConversion(String s) {
        // Complete this function
    	
    	 SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
         SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
         Date date =new Date();
         try {
			  date = parseFormat.parse(s);
		} catch (ParseException e) {
 			e.printStackTrace();
		}
         return displayFormat.format(date);
         
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
  System.out.println(result);
    }
}
