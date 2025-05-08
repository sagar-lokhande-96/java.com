public class factorial {
    public static void fact(int n){
        int fact =1;
        for(int i =1;i<n;i++){
            fact *=i;
        }
        System.out.print("factorial of the given number is : "+fact);
    }
    public static void main(String arg[]){
        fact(10);
    }
}
