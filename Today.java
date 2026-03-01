// 1,2,3,4,
public class Today{
    public static void main(String args[]){
        int arr[] = {3,7,9,2,5};
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("Total count odd number :- " + count); 
    }
}