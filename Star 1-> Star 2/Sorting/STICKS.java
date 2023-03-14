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
		    int[] A = new int[N];
		    
		    for(int i=0; i<N; i++){
		        A[i] = sc.nextInt();
		    }
		    boolean[] chosen = new boolean[N];
		    Arrays.sort(A);
		    int length = 0, breadth=0;
		    
		    for(int i=N-1; i>0; i--){
		        if(A[i] == A[i-1] && chosen[i] != true){
		            if(length == 0){
		                length = A[i];
		            }
		            else if(breadth == 0){
		                breadth = A[i];
		            }
		            chosen[i] = true;
		            chosen[i-1] = true;
		        }
		        if(length!= 0 && breadth != 0)
		            break;
		    }
		    int area = length!=0 && breadth!=0 ? length*breadth : -1;
		    System.out.println(area);
		}
	}
}
