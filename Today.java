public class Today{
    public static void main(String args[]){
        int arr[] = {4,2,1,4,5,3};
        int start = 0;
        int end =arr.length -1;

       while(start < end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;

        start++;
        end--;
       }

       // Print reversed arrays
       for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
}