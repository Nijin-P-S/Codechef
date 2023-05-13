package Practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class START01 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        System.out.println(n);
    }
}
