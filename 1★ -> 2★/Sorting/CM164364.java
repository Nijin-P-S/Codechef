/*
 * Link to problem : https://www.codechef.com/LP1TO204/problems/CM164364?tab=solution
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
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    HashSet<Integer> unique = new HashSet<>();
		    for(int i=0; i<n; i++){
		        unique.add(sc.nextInt());
		    }
		    if(n-unique.size()>=x){
		        System.out.println(unique.size());
		    }
		    else{
		        System.out.println(unique.size()-(x-(n-unique.size())));
		    }
		}
	}
}
