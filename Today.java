// 1,2,
public class Today{
    public static void main(String args[]){
        // find out the minimum number in array
        int arr[] = {3,6,9,24,2};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}