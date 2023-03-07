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
		    int N = sc.nextInt();
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    
		    for(int i=0; i<N; i++){
		        int num = sc.nextInt();
		        min = Math.min(min, num);
		        max = Math.max(max, num);
		    }
		    System.out.println(max-min);
		}
	}
}
