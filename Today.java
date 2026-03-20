public class Today{
    public static void main(String args[]){
        int arr[] = {4,7,9,3,3,5,6};
        int start = 0;
        int end = arr.length -1;
        //swaps
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // print reversed array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}