/*
 * Link to the problem : https://www.codechef.com/LP1TO201/problems/PROGLANG
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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int ans = 0;
		    for(int i=1;i<=2; i++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        
		        if((x == A && y==B) || (x == B && y==A))
		            ans = i;
		    }
		    System.out.println(ans);
		}
	}
}
