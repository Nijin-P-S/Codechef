/*
 * Link to problem : https://www.codechef.com/LP1TO201/problems/WEIGHTBL
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
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    
		    double change = (w2-w1);
		    
		    if(change >= (M*x1) && change <= (M*x2)){
		        System.out.println(1);
		    }
            else{
                System.out.println(0);
            }
		}
	}
}
