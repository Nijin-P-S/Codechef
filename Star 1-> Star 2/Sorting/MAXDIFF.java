/*
 * Link to problem : https://www.codechef.com/LP1TO204/problems/MAXDIFF
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
		    int K = sc.nextInt();
		    
		    long fSumOne = 0;
		    long kSumOne = 0;
		    long fSumTwo = 0;
		    long kSumTwo = 0;
		    long[] w = new long[N];
		    
		    for(int i=0; i<N; i++){
		        w[i] = sc.nextLong();
		    }
		    Arrays.sort(w);
		    
		    for(int i=0; i<K; i++){
		        kSumOne+=w[i];
		    }
		    
		    for(int i=K; i<N; i++){
		        fSumOne+= w[i];
		    }
		    
		    for(int i=N-1; i>=N-K; i--){
		        fSumTwo+= w[i];
		    }
		    
		    for(int i=N-K-1; i>=0; i--){
		        kSumTwo+= w[i];
		    }
		    System.out.println(Math.max(fSumTwo-kSumTwo, fSumOne-kSumOne));
		}
	}
}
