// SI = Principle * Raste * Time / 100

import java.util.Scanner;

public class simpleInterest {
    public static int Calculate(int Principle, int Rate, int Time){
        return (Principle * Rate * Time)/ 100;
    }
    public  static void main (String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the principle amount : ");
            int Principle = sc.nextInt();
            System.out.print("Enter the Rate of Interest : ");
            int Rate = sc.nextInt();
            System.out.print("Enter the Time in years : ");
            int Time = sc.nextInt();
            
            System.out.println("Simple Interest is : " + Calculate(Principle,Rate, Time));
        }
    }
}
