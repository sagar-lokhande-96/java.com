public class printPrimeUptoN {
    public static void main(String arg[]){
        printUpto(26);
    }

    public static void printUpto(int n ){
        for(int i=2;i<=n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }

        }
    }

    public static boolean checkPrime(int n){
        if (n < 2) {
            return false;
        }
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
        
    }
}
