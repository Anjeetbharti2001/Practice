public class Today{
    public static void main(String args[]){
        int arr[] = {1,5,8,90,34,5};
        int sum = arr[0];

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}