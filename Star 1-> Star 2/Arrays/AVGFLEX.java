/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/AVGFLEX
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
		    int n = sc.nextInt();
		    
		    int[] freq = new int[101];
		    for(int i=0; i<n; i++){
		        int score = sc.nextInt();
		        freq[score]++;
		    }
		    int cnt = 0;
		    int ans = 0;
		    for(int i=0; i<101; i++){
		        if(freq[i] != 0){
		            cnt+=freq[i];
		            if(cnt > n-cnt){
		                ans+=freq[i];
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}
