public class Today{
    public static void main(String args[]){
        int arr[] = {3,6,8,0,3,7,1};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; i<arr.length - 1 - i; i++){
               if(arr[i] > arr[j + 1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j];
                arr[j + 1] = temp;
               }
            }
        }
        //print sorted array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}