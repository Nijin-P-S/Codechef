/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/ALPHABET
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
		HashMap<Character, Boolean> chars = new HashMap<>();
		
		String s = sc.next();
		for(int i=0; i<s.length(); i++){
		    chars.put(s.charAt(i), true);
		}
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
		    String cur = sc.next();
		    Boolean yes = true;
		    for(int j=0; j<cur.length(); j++){
		        if(chars.get(cur.charAt(j)) == null){
		            yes = false;
		            break;
		        }
		    }
		    if(yes){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
