/*
 * Link to problem : https://www.codechef.com/LP1TO204/problems/LINCHESS
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
		    
		    int moves = Integer.MAX_VALUE;
		    int ans = -1;
		    for(int i=0; i<N; i++){
		        int p = sc.nextInt();
		        if(p>K)
		            continue;
		        else{
		            if(K%p == 0){
		                if(moves > K/p){
		                    moves = Math.min(moves, K/p);
		                    ans = p;
		                }
		                
		            }
		        }
		    }
		    ans = moves == Integer.MAX_VALUE ? -1 : ans;
		    System.out.println(ans);
		}
	}
}
