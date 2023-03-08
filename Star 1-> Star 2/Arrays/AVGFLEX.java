/*
 * Link to problem : https://www.codechef.com/LP1TO202/problems/AVGFLEX
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
		    int n = sc.nextInt();
		    
		    int[] score = new int[n];
		    for(int i=0; i<n; i++){
		        score[i] = sc.nextInt();
		    }
		    
		    int count = 0;
		    
		    for(int i=0; i<n; i++){
		        int boast = 0;
		        for(int j=0; j<n; j++){
		            if(score[j]<=score[i])
		                boast++;
		        }
		        if(boast > n-boast)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
