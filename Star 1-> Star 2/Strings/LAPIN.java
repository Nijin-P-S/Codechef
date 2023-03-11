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
		    HashMap<Character, Integer> firstHalf = new HashMap<>();
		    HashMap<Character, Integer> secondHald = new HashMap<>();
		    String s = sc.next();
		    int left = 0, right = s.length()-1;
		    
		    while(left < right){
		        if(firstHalf.get(s.charAt(left)) == null){
		            firstHalf.put(s.charAt(left), 0);
		        }
		        if(secondHald.get(s.charAt(right)) == null){
		            secondHald.put(s.charAt(right), 0);
		        }
		        firstHalf.put(s.charAt(left), firstHalf.get(s.charAt(left))+1);
		        secondHald.put(s.charAt(right), secondHald.get(s.charAt(right))+1);
		        left++;
		        right--;
		    }
		    boolean yes = true;
		    for(Character c : firstHalf.keySet()){
		        if(secondHald.get(c) == null || secondHald.get(c) != firstHalf.get(c)){
		            yes = false;
		            break;
		        }
		    }
		    if(yes){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
