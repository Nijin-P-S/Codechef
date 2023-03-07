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
		    HashSet<Integer> unique = new HashSet<>();
		    int minInd = Integer.MAX_VALUE;
		    for(int i=1; i<=N; i++){
		        int num = sc.nextInt();
		        
		        if(num <= 7 && unique.size() < 7 && !unique.contains(num)){
		            unique.add(num);
		        }
		        if(unique.size() == 7){
		            minInd = Math.min(minInd, i);
		        }
		    }
		    System.out.println(minInd);
		}
	}
}
