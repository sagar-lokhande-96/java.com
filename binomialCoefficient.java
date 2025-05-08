public class binomialCoefficient {
    public static int factorial(int n ){
        int fact = 1;
        for(int i =1; i<n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void binCoeff(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nMr_fact = factorial(n-r);
        int sum = n_fact / (r_fact * nMr_fact);
        System.out.println("Ans is : "+ sum);
    }
    public static void main(String[] args) {
        binCoeff(5,2);
    }
}
