/*
 * Link to problem : https://www.codechef.com/LP1TO203/problems/SNAKPROC
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
		    String snakes = sc.next();

		    boolean valid = true;

		    boolean head = false;
		    boolean tail = false;
		    for(int i=0; i<N; i++){
		        if(snakes.charAt(i) == '.')
		            continue;
		        else if((snakes.charAt(i) == 'H' && head == true) || (snakes.charAt(i) == 'T' && tail == true) || (snakes.charAt(i) == 'T' && head == false) ){
		            valid = false;
		            break;
		        }
		        else if(snakes.charAt(i) == 'T'){
		            head = false;
		            tail = false;
		        }
		        else if(snakes.charAt(i) == 'H'){
		            head = true;
		        }
		    }
		    
		    if(valid && head == false && tail ==false){
		        System.out.println("Valid");
		    }  
		    else{
		        System.out.println("Invalid");
		    }
		    
		}
	}
}
