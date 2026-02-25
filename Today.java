public class Today{
    public static void main(String args[]){
        // Find out the largest element in array
        int arr[] = {2,5,6,7,8};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}