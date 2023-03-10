/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/MAGDOORS
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
		    int count = 0;
		    
		    for(int i=0; i<s.length() ; i++){
		        if((s.charAt(i)=='1' && count%2==0) || (s.charAt(i)=='0' && count%2==1)){
		            continue;
		        }
		        else{
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
