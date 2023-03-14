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
		
		while(T-- > 0){
		    int[] A = new int[10];
		    for(int i=0; i<A.length; i++)
		        A[i] = sc.nextInt();
		      
		    int K = sc.nextInt();  
		    int ind = 9;
		    while(ind >=0 && K>0){
		        if(K>=A[ind]){
		            K-=A[ind--];
		        }
		        else{
		            break;
		        }
		    }
		    while(ind>=0 && A[ind]==0){
		        ind--;
		    }
		    System.out.println(ind+1);
		}
	}
}
