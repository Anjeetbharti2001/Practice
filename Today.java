// find minimum number in arrays
public class Today{
    static int min(int arr[], int n){
        if(n == 1)
            return arr[0];

        return Math.min(arr[n - 1], min(arr, n - 1));
    }
    public static void main(String args[]){
        int arr[] = {5, 2, 8, 1, 9};
        System.out.println(min(arr, arr.length));
    }
}