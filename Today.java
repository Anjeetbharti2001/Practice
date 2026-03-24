public class Today{
    public static void main(String args[]){
        int arr[] = {0,9,8,7,6,5,4,3,2,1};
        int start = 0;
        int end = 0; 
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        //reversed print
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}