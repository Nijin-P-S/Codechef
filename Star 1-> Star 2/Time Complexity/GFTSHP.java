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
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    
		    long A[] = new long[N];
		    for(int i=0; i<N; i++){
		        A[i] = sc.nextLong();
		    }
		    Arrays.sort(A);
		    int count = 0;
		    int ind = 0;
		    while(K>=0 && ind < N){
		        if(K-A[ind] < 0)
		            break;
		        K-=A[ind++];
		        count++;
		    }
		    if(K>0 && ind < N){
		        if(K-(A[ind]*(1/2.0)) >= 0)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
