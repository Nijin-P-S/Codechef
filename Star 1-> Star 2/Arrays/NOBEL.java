/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/NOBEL?tab=statement
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc = new FastReader();
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    
		    int[] freq = new int[M+1];
		    
		    for(int i=0; i<N; i++){
		        int rsch = sc.nextInt();
		        freq[rsch]++;
		    }

		    boolean vac = false;
		    
		    for(int i=1; i<=M; i++){
		        if(freq[i] == 0){
		            vac = true;
		            break;
		        }
		            
		    }
		    
		    if(vac == true){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
