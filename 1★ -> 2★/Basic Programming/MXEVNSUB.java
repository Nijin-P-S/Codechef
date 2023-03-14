/*
 * Link to problem : https://www.codechef.com/LP1TO201/problems/MXEVNSUB
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
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    
		    int sum = (N*(N+1))/2;
		    
		    if(sum%2 == 0){
		        System.out.println(N);
		    }
		    else{
		        System.out.println(N-1);
		    }
		}
	}
}
