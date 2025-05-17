public class checkPalindrome{
    public static boolean isPalindrome(int num){
        int original = num;
        int ans = 0;
        while(num > 0){
            int LD = num % 10;
            ans = ans * 10 + LD;
            num /= 10; 
        }
        return original == ans;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(123));  // false
    }
}