/*
 * Link to problem : https://www.codechef.com/LP1TO205/problems/CFRTEST
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
		    HashSet<Integer> hashSet = new HashSet<>();
		    
		    for(int i=0; i<N; i++){
		        int d = sc.nextInt();
		        hashSet.add(d);
		    }
		    System.out.println(hashSet.size());
		}
	}
}
