/*
 * Link to problem : https://www.codechef.com/LP1TO201/problems/CHFSPL
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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int sum = 0;
		    if(A>=B){
		        if(B>C)
		            sum+=(A+B);
		        else{
		            sum+=(A+C);
		        }
		    }
		    else if(B>=C){
		        if(C>A)
		            sum+=(B+C);
		        else{
		            sum+=(B+A);
		        }
		    }
		    else if(C>=A){
		        if(A>B)
		            sum+=(C+A);
		        else{
		            sum+=(C+B);
		        }
		    }
		    System.out.println(sum);
		}
	}
}
