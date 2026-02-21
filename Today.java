public class Today{
    public static void main(String args[]){
        //Find the largest element i array
        int arr[] = {2,6,9,0,3};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]  > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}