import java.util.Scanner;

public class areaOfSquare {
    public static void main(String arg[]){
        System.out.print("Enter the side of the square : ");
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int area = side * side;
            System.out.println("The Area of the square is : "+area);
        }
    }
}
