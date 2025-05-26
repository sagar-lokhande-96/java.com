//  TC = O(log n) this is batter as compare to O(n)
// Binary Search in ASCCENDING order
public class binarySearch {
    public static int binarySearchOperation(int num[], int key){
        int start = 0, end = num.length-1;
        while(start<=end){
            int middle = (start+end)/2;
            if(num[middle]==key){
                return middle;
            }
            else if(num[middle] < key){
                start = middle + 1;  
            }
            else{
                end = middle - 1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,14,19,20,40};
        int key = 19;
        int result = binarySearchOperation(numbers, key);
        System.out.println("The index is "+result);
    }
}


// start += 1 || end -+ 1 ==> rakha toh worst case me TC O(n) hogi, then used start = middle +....