public class Today{
    public static void main(String args[]){
        int arr[] = {3,4,6,7,9,2,4,7};
        int start = 0;
        int end = arr.length -1;

        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        // reversed arrays in java 
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}