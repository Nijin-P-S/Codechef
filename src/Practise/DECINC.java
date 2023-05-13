package Practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DECINC {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        if(n%4 == 0)
            System.out.println(n+1);
        else
            System.out.println(n-1);
    }
}
