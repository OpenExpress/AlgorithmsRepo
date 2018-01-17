package com.thirity.day.challenge;
import java.util.*;

public class Basic004 {
//	https://www.hackerrank.com/challenges/birthday-cake-candles/problem
//	Points: 40 Rank: 540882

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
    	int currValue=ar[0];
    	int count=0;
    	
    	for(int i=0;i<n;i++)
    	{
    		 if(ar[i]==currValue)
    		 {
    		 count++;
    		 }else if(ar[i]>currValue)
    		     {
    			 count=1;
    			 currValue=ar[i];
    			 }
    		
    	}return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
