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
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    HashSet<Character> chars = new HashSet<>();
		    chars.add('E');
		    chars.add('Q');
		    chars.add('U');
		    chars.add('I');
		    chars.add('N');
		    chars.add('O');
		    chars.add('X');
		    
		    long sarthak = 0;
		    long anuradha = 0;
		    
		    for(int i=0; i<N; i++){
		        String s = sc.next();
		        if(chars.contains(s.charAt(0))){
		            sarthak+=A;
		        }
		        else{
		            anuradha+=B;
		        }
		    }
		    if(sarthak > anuradha){
		        System.out.println("SARTHAK");
		    }
		    else if(sarthak < anuradha){
		        System.out.println("ANURADHA");
		    }
		    else{
		        System.out.println("DRAW");
		    }
		}
	}
}
