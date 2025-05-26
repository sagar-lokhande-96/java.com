/* TC = O(n(square))  ==> Because it is using nested loops */ 


public class arraypairs {
    public static void findPairs(int arr[]){
        int sum =0;
        for(int i=0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("["+arr[i]+","+arr[j]+"] ");
                sum++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is : "+sum);
    }


    public static void main(String arg[]){
        int numbers[] ={1,3,5,2,7};
        findPairs(numbers);
    }
}
