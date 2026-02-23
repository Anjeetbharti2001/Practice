public class Today{
    public static void main(String args[]){
        // Find out the largest number in array
        int arr[] = {3,6,8,9};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}