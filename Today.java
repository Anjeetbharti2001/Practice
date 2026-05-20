public class Today{
    static int max(int arr[], int n){
        if(n == 1)
            return arr[0];
        return Math.max(arr[n - 1], max(arr, n -1));
    }
    public static void main(String args[]){
        int arr[] = {2, 8, 1, 15, 6};
       System.out.println(max(arr, arr.length));
    }
}