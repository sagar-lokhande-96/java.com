/* two types of solution for this 
1. using swapping    TC = O(n), SC = O(1)
2. using 2nd array variable  TC = O(n), SC = O(n) */ 

public class reverseArray {
    public static void reverseUsingSwap(int num[]){
        int start =0, end = num.length-1; 
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            end--;
            start++;
        }

        System.out.println("\n After reversing ");
        System.out.print("Array : ");
        for(int i=0; i<num.length;i++){
           System.out.print(" "+num[i]);
        }
    }

    public static void reverseUsingVar(int num[] ){
        int cpArray[] = new int[num.length]; 
        for(int i = 0;i<num.length;i++){
            cpArray[i] = num[num.length-1-i];
        }
        System.out.println("\n Reverse \n");
        System.out.print("Array : ");
        for(int i =0;i<cpArray.length;i++){
            System.out.print(" "+cpArray[i]);
        }
    }


    public static void main(String arg[]){
        int numbers[] = {1,4,7,2,8,9,4,3,54,56,92,4,1};
        System.out.print("Array : ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }

        // 1st Approach
        reverseUsingSwap(numbers);


        // 2nd Approach
        // reverseUsingVar(numbers);
    }
}
