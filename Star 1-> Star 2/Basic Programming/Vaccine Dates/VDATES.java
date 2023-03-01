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
        int t = sc.nextInt();

        while(t-- > 0){
            int D = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            if(D>= L){
                if(D>R){
                    System.out.println("Too Late");
                }
                else{
                    System.out.println("Take second dose now");
                }
            }
            else{
                System.out.println("Too Early");
            }
        }
	}
}
