import java.util.Scanner;
public class binToDecimal {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Binary No : ");
            int num = sc.nextInt();
            int sum =0;
            int pow =0;
            while(num>0){
                int LastDigit = num%10;
                num = num/10;
                sum = sum + ((int) Math.pow(2, pow) * LastDigit );
                pow++;

            }
            System.out.println(sum);
        }
    }
}
