public class printPrime {
    public static void printPrimeNO(int n){
        boolean ans = true;
        for(int i=2; i<n;i++){
            if(n%i==0){
                ans = false;
                break;
            }
            
        }
        if(ans==true){
            System.out.println("This is an prime no : "+n);
        }
        else{
            System.out.println("Not a prime no : "+n);
        }
    }
    public static void main(String[] args) {
        printPrimeNO(11);
    }
}
