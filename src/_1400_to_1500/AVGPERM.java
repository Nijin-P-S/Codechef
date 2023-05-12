package _1400_to_1500;

import java.util.Scanner;

public class AVGPERM {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if(N==3){
                System.out.println("1 2 3");
            }
            else{
                System.out.print(N+" "+(N-2)+" ");
                for(int i=1; i<N-3; i++)
                    System.out.print(i+" ");
                System.out.print((N-3)+" "+(N-1));
            }
            System.out.println();
        }
    }
}
