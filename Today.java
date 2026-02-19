public class Today{
    public static void main(String args[]){
        // find the largest element in array
        int arr[] = {1, 5,3,6,2};
             int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}