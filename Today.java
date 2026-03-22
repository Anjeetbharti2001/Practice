public class Today{
    public static void main(String args[]){
        int arr[] = {3,6,8,9,3};
        int start = 0; 
        int end = arr.length -1;
        
        //swap 
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        // reversed print
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}