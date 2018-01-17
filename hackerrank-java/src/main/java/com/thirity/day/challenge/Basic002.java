package com.thirity.day.challenge;

import java.util.Scanner;

public class Basic002 {
	 
/*	Consider a staircase of size :

		   #
		  ##
		 ###
		####
		Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

		Write a program that prints a staircase of size .

		Input Format

		A single integer, , denoting the size of the staircase.

		Output Format

		Print a staircase of size  using # symbols and spaces.

		Note: The last line must have  spaces in it.

		Sample Input

		6 
		Sample Output

		     #
		    ##
		   ###
		  ####
		 #####
		######
		Explanation

		The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.*/
	
	
	static void staircase(int n) {
	        // Complete this function
		for(int i=0;i<n;i++)
		{
			//loop to print space
			for(int x=0;x<(n-i)-1;x++)
			{
				System.out.printf(" ");
			}
			//loop to print hash
			for(int x=n-i;x<=n;x++)
			{
				System.out.printf("#");
			}
			System.out.println();
		}
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        staircase(n);
	        in.close();
	    }
}
