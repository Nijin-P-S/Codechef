package _1400_to_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SHKNUM {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bu.readLine()), p[] = new int[31], i;
        p[0] = 1;
        for(i=1; i<31; i++)
            p[i] = p[i-1]*2;
        ArrayList<Integer> a1 = new ArrayList<>();

        for(i=0; i<31; i++){
            for(int j=0; j<31; j++){
                if(i == j)
                    continue;
                a1.add(p[i]+p[j]);
            }
        }
        while(t-- > 0){
            int n = Integer.parseInt(bu.readLine());
            int min = Integer.MAX_VALUE;
            for(i=0; i<a1.size(); i++){
                min = Math.min(min, Math.abs(n-a1.get(i)));
            }
            sb.append(min+"\n");
        }
        System.out.println(sb.toString());
    }
}
