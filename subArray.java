// TC = O(n(cube))  ==> because uses three nested loops

public class subArray{
    public static void printSubArrays(int arr[]){
        int start , end;  // declaring start and end variables for better understanding
        for(int i =0;i<arr.length;i++){
            start = i;
            for(int j=i;j<arr.length;j++){
                end = j;
                System.out.print("[");
                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+" "); 
                }
                System.out.println("] ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int numbers[] = {1,2,3,4,5};
        printSubArrays(numbers);
    }

}