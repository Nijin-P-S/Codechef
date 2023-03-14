/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/PAWRI
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
		    String check = "party";
		    String replace = "pawri";
		    StringBuilder ans = new StringBuilder();
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i) == 'p'){
		            int p1 = i, p2 =0;
		            while(p1<s.length() && p2<check.length() && check.charAt(p2) == s.charAt(p1)){
		                p1++;
		                p2++;
		            }
		            if(p2 == check.length()){
		                ans.append(replace);
		                i = p1-1;
		            }
		            else{
		                ans.append(""+s.charAt(i));
		            }
		        }
		        else{
		            ans.append(s.charAt(i));
		        }
		    }
		    System.out.println(ans.toString());
		}
	}
}
