import java.util.Scanner;
public class sumOfNNaturalNo{
    public static int total(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum += i;

        }
        return sum;
    }
    public static void main(String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no: ");
            int a = sc.nextInt();
            System.out.println("total sum is : "+total(a));
        }
    }
}