public class Today{
    public static void main(String args[]){
        int arr[] = {4,7,8,9};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}