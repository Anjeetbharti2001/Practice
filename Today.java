public class Today{
    public static void main(String args[]){
        // Find the minimum element in array
        int arr[] = { 3,7,8,9,2};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min )
                min = arr[i];
        }
        System.out.println(min);
    }
}