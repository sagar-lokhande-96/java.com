import java.util.Scanner;

public class checkNoPositiveOrNot {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if(num<0){
                System.out.println("negative number hai ye !!!");
            }
            else{
                System.out.println("Yeh hai positive no : "+num);
            }
        }
    }
}
