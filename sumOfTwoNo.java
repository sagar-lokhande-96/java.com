// Sum = a + b

import java.util.Scanner;
public class sumOfTwoNo {
    public static int sum(int n, int m){
        return n+m;
    }
    public static void main(String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("Enter first no :");
            int n = sc.nextInt();
            System.out.print("Enter second no :");
            int m  = sc.nextInt();
            System.out.println("Sum of two no is : "+sum(n,m));
        }
    }
}
