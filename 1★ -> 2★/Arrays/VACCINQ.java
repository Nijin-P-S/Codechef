/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/VACCINQ
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
		    int P = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    int sum = 0;
		    for(int i=1; i<=N; i++){
		        int elem = sc.nextInt();
		        if(i > P)
		            continue;
		        else if(elem == 0)
		            sum+=X;
		        else if(elem == 1)
		            sum+=Y;
		    }
		    System.out.println(sum);
		}
	}
}
