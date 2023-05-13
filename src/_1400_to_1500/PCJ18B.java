package _1400_to_1500;

import java.util.Scanner;

public class PCJ18B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int ans = 0;

            for(int i=1; i<=N; i+=2){
                ans+=Math.pow((N-i+1), 2);
            }
            System.out.println(ans);
        }
    }
}
