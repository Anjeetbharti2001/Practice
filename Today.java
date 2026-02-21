public class Today{
    public static void main(String args[]){
        // count odd number in array
        int arr[] = {2,6,7,8,9,5};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){ // odd check here
                count++;
            }
        }
        System.out.println(count);
    }
}