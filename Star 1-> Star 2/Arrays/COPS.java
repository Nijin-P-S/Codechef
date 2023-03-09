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
		    int M = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
            int[] cops = new int[M];
            
            for(int i=0; i<M; i++){
                cops[i] = sc.nextInt();
            }
            
            int count = 0;
            
            for(int i=1; i<=100; i++){
                boolean safe = true;
                
                for(int j=0; j<M; j++){
                    int left = Math.max(1, cops[j]-x*y);
                    int right = Math.min(100, cops[j]+x*y);
                    
                    if(i>=left && i<=right){
                        safe = false;
                    }
                }
                if(safe){
                    count++;
                }
            }
            System.out.println(count);
		}
	}
}
