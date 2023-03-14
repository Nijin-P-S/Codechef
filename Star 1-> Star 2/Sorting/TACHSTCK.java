/*
 * Link to problem : 
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] L = new int[N];
        boolean[] paired = new boolean[N]; // boolean array to keep track of paired sticks

        for(int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }

        Arrays.sort(L);
        long count = 0;

        for(int i=1; i<N; i++) {
            if(!paired[i-1] && L[i]-L[i-1] <= D) { // check if previous stick is unpaired and the difference is within limit
                count++;
                paired[i-1] = true;
                paired[i] = true; // mark current stick as paired
            }
        }

        System.out.println(count);
    }
}
