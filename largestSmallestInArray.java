public class largestSmallestInArray {
    public static void findLargestAndSmallest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<num.length;i++){
            if(largest <= num[i]){
                largest = num[i];
            }
            if(smallest >= num[i]){
                smallest = num[i];    
            }
        }
        System.out.println("largest value is : "+largest);
        System.out.println("smallest value is : "+smallest);

    }
    public static void main(String arg[]){
        int numbers[] = {5,8,23,8,4,9,3,67,34,4,50};
        findLargestAndSmallest(numbers);
    }
}
