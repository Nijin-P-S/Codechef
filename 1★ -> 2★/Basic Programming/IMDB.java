/*
 * Link to the problem : https://www.codechef.com/LP1TO201/problems/IMDB
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
		    int X = sc.nextInt();
		    
		    int maxImdb = Integer.MIN_VALUE;
		    
		    for(int i=0; i<N; i++){
		        int S = sc.nextInt();
		        int R = sc.nextInt();
		        
		        if(S > X)
		            continue;
		        else{
		            if(R > maxImdb)
		                maxImdb = R;
		        }
		    }
		    System.out.println(maxImdb);
		}
	}
}
