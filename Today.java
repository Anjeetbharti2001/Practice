public class Today{
    public static void main(String args[]){
        int arr[] = {3,6,7,8,9};
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min ){
                 min = arr[i];
            }
           
        }
        System.out.println(min);
    }
}