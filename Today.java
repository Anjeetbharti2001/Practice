public class Today{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,5,6,6,7,7,8,8};
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            

            start++;
            end--;
        }
        // reversed in arrays
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}