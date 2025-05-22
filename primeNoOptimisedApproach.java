public class primeNoOptimisedApproach{
    public static void main(String arg[]){
        System.out.println(checkPrime(2));
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