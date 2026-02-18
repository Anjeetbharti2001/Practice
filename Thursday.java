// Find the minimum element in array
public class Thursday{
    public static void main(String args[]){
        int arr[] = {2,5,6,7,3,7,9};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element i array:-" + min);
    }
}