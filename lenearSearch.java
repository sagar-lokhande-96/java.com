// TC = O(n)

public class lenearSearch{
    public static int SearchKey(int num[], int key){
        for(int i = 0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int key = 5;
        int numbers[] = {1,3,5,4,68};
        // int ans = SearchKey(numbers, key);
        if(SearchKey(numbers, key) == -1){
            System.out.println("key was Not found!!!");
        }
        else{
            System.out.println("founded on index no : "+ SearchKey(numbers, key));
        }
    }
}