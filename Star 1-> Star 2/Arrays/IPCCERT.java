/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/IPCCERT
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
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<N; i++){
		    int curTime = 0;
		    int Q = 0;
		    for(int j=0; j<K; j++){
		        int t = sc.nextInt();
		        curTime+=t;
		    }
		    Q = sc.nextInt();
		    if(Q<=10 && curTime >= M)
		        count++;
		}
		System.out.println(count);
	}
}
