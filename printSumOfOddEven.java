import java.util.Scanner;

public class printSumOfOddEven{
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            int number ;
            int choose;
            int evenSum = 0;
            int oddSum = 0;
            do { 
                System.out.print("Enter the number : ");
                number = sc.nextInt();
                if(number%2 ==0){
                    evenSum += number;
                }
                else{
                    oddSum += number;
                }
                System.out.println("If you want to continue then Enter 1, else Enter 0");
                choose = sc.nextInt();

            } while (choose==1);
            System.out.println("Sum of all the Even number is : "+evenSum);
            System.out.println("Sum of all the odd number is : "+oddSum);
        }
    }
}