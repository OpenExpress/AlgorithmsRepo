package com.thirity.day.challenge;
import java.util.*;

public class Basic001 {

    static void plusMinus(int[] arr) {
        // Complete this function
    	double nAvg=0;
    	double pAvg=0;
    	double zAvg=0;
    	for (int i : arr) {
    		if(i>0)
    		{
    			pAvg++;	
    		}
    		if(i<0)
    		{
    			nAvg++;	
    		}
    		if(i==0)
    		{
    			zAvg++;	
    		}
		}
    
    	
		    	System.out.printf("%.5f\n",pAvg/arr.length);
		    	System.out.printf("%.5f\n",nAvg/arr.length);
		    	System.out.printf("%.5f\n",zAvg/arr.length);
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}