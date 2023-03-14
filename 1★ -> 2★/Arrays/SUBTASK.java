/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/SUBTASK
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
		    int M = sc.nextInt();
		    int K = sc.nextInt();
		    
		    boolean pass = true;
		    int sum = 0;
		    
		    for(int i=1; i<=N;i++){
		        int t = sc.nextInt();
		        if(t==0 && i<=M){
		            pass = false;
		        }
		        sum+=t;
		    }
		    if(pass == false){
		        System.out.println(0);
		    }
		    else if(sum == N){
		        System.out.println(100);
		    }
		    else{
		        System.out.println(K);
		    }
		}
	}
}
