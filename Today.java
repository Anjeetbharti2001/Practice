public class Today{
    public static void main(String args[]){
        // Find the largest element in array
        int arr[] = {3,8,9,0,5,4,2};
        int max = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}