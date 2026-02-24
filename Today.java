public class Today{
    public static void main(String args[]){
        int arr[] = {3,7,9,3,5,6};
        int start =  0;
        int end = arr.length - 1;
        while (start < end ){
            // swap
            int temp = arr[start];
            arr[end] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
        // print reverse Array
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }   
    }
}