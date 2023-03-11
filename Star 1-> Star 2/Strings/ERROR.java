/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/ERROR
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
		    String s = sc.next();
		    boolean possible = false;
		    for(int i=0; i<s.length()-2; i++){
		        StringBuilder cur = new StringBuilder();
		        cur.append(s.charAt(i)+""+s.charAt(i+1)+""+s.charAt(i+2));
		  
		        if(cur.toString().equals("101") || cur.toString().equals("010")){
		            possible = true;
		            break;
		        }
		    }
		    if(possible){
		        System.out.println("Good");
		    }
		    else{
		        System.out.println("Bad");
		    }
		}
	}
}
