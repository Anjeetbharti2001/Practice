public class Today{
    public static void main(String args[]){
        // count even number in array
        int arr[] = {5,2,4,3,2};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){ // check even number
               count++;
            }
        }
        System.out.println(count);
    }
}