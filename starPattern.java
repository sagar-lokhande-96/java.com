public class starPattern {
    public static void hollowRectangle(int row, int col){
        System.out.println("---------- This is an hollow rectangle pattern ----------");
        for(int i=1;i<=row;i++){
            for(int j =1;j<=col;j++){
                if((i==1 || j==1) || (i==row || j==col)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        //hollowRectangle(4, 5);
    }
}
