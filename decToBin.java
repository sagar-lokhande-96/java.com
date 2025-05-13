import java.util.Scanner;

public class decToBin {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Decimal No : ");
            int num = sc.nextInt();
            String bin = "";
            while(num>0){
                int rem = num%2;
                bin = String.valueOf(rem)+bin;
                num = num / 2;
            }
            System.out.println("Binary is : "+bin);
        }
    }
}
