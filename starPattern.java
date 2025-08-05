
public class starPattern {

    public static void hollowRectangle(int row, int col) {
        System.out.println("---------- This is an hollow rectangle pattern ----------");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || j == 1) || (i == row || j == col)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotated_HalfPyramid(int n) {
        System.out.println("---------- This is an invertedAndRotated_HalfPyramid pattern ----------");
        for (int i = 1; i <= n; i++) {
            // int j=1;j<n-i;j++
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_HalfPyramidWithNumbers(int n) {
        System.out.println("---------- This is an inverted_HalfPyramidWithNumbers pattern ----------");
        for (int i = 1; i <= n; i++) {
            int number = 1;
            for (int j = n; j >= i; j--) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int row) {
        System.out.println("---------- This is an floyds_triangle pattern ----------");
        int number = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d",number);
                // printf allows formatted output, and %3d prints an integer in a 3-character wide, right-aligned field.

                number++;
            }
            System.out.println();
        }
    }

    public static void triangleOf_0And1(int n){
        System.out.println("---------- This is an triangleOf_0And1 pattern ----------");
        for(int i=1;i<=n;i++){
            int num = (i % 2 == 0) ? 0 : 1; // Even row starts with 0, odd with 1

            for(int j =1;j<=i;j++){
                System.out.print(num);
                num = 1 - num;   // value ko toggle kiya , matlab 1-1=0 && 1-0=1
                
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollowRectangle(4, 5);
        invertedAndRotated_HalfPyramid(7);
        inverted_HalfPyramidWithNumbers(5);
        floyds_triangle(5);
        triangleOf_0And1(5);
    }
}
