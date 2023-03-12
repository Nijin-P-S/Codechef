/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/PASSWD
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
		    String cur = sc.next();
		    boolean yes = true;
		    int up = 0, digit = 0, spcl = 0, low = 0;
		    HashSet<Character> special = new HashSet<>();
		    special.add('@');
		    special.add('#');
		    special.add('%');
		    special.add('&');
		    special.add('?');
            if(Character.isLowerCase(cur.charAt(0)) || Character.isLowerCase(cur.charAt(cur.length()-1))){
                low++;
            }
            
		    for(int i=1; i<cur.length()-1; i++){
    		    if(Character.isUpperCase(cur.charAt(i)))
    		        up++;
	            else if(Character.isDigit(cur.charAt(i)))
	                digit++;
	            else if(special.contains(cur.charAt(i))){
	                spcl++;
	            }
	            else if(Character.isLowerCase(cur.charAt(i)))
	                low++;
	        }
	        if(up==0 || digit==0 || spcl==0 || low == 0 || cur.length()<10){
	            System.out.println("NO");
	        }
	        else{
	            System.out.println("YES");
	        }
	    }
	}
}
