/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/HIRETEST
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
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    StringBuilder ans = new StringBuilder();
		    while(N-- > 0){
		        String grade = sc.next();
		        int cX = 0, cY = 0;
		        
		        for(int i=0; i<grade.length(); i++){
		            if(grade.charAt(i) == 'U')
		                continue;
		            else if(grade.charAt(i) == 'F')
		                cX++;
		            else if(grade.charAt(i) == 'P')
		                cY++;
		        }
		        if(cX >= X){
		            ans.append("1");
		        }
		        else if(cX == X-1 && cY >= Y){
		            ans.append("1");
		        }
		        else{
		            ans.append("0");
		        }
		    }
		    System.out.println(ans.toString());
		}
	}
}
