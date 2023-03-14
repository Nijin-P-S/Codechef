/*
 * Link to problem : https://www.codechef.com/LP1TO204/problems/SIGNFLIP
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
		    int K = sc.nextInt();
		    
		    long sum = 0;
		    
		    int arr[] = new int[N];
		    
		    for(int i=0; i<N; i++)
		        arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    
		    int ind = 0;
		    while(ind < arr.length && arr[ind] < 0 && K>0){
		        sum+=(-1*arr[ind++]);
		        K--;
		    }
		    ind = arr.length-1;
		    while(ind >= 0 && arr[ind] > 0){
		        sum+=arr[ind--];
		    }
		    System.out.println(sum);
		}
	}
}
