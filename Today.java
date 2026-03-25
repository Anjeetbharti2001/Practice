public class Today{
    public static void main(String args[]){
        int arr[] = {4,6,8,9};
        int start = 0; 
        int end = arr.length-1;
        
        while(start < end){
            int temp = arr[start];
            arr[end] = arr[end];
            arr[start] = temp;
            start++;
            end--;
        }
        // print revesed array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}