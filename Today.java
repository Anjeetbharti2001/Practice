// find the largest element in array
public class Today{
    public static void main(String args[]){
        int arr[] = {2,4,5,8,93};
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("Array in maximum number:-" + max);
    }
}