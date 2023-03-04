/*
 * Link to problem : 
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<Integer, Integer> noOfSticks = new HashMap<>();
		noOfSticks.put(0, 6);
		noOfSticks.put(1, 2);
		noOfSticks.put(2, 5);
		noOfSticks.put(3, 5);
		noOfSticks.put(4, 4);
		noOfSticks.put(5, 5);
		noOfSticks.put(6, 6);
		noOfSticks.put(7, 3);
		noOfSticks.put(8, 7);
		noOfSticks.put(9, 6);
		while(T-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int sum = a+b;
		    
		    int count = 0;
		    
		    while(sum>0){
		        int rem = sum%10;
		        count+=noOfSticks.get(rem);
		        sum/=10;
		    }
		    System.out.println(count);
		}
		
	}
}
