/*
 * Link to problem : https://www.codechef.com/LP1TO201/problems/MANYSUMS
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
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    
		    if(L == R){
		        System.out.println(1);
		    }
		    else{
		        System.out.println((R-L+1)+(R-L));
		    }
		}
	}
}
