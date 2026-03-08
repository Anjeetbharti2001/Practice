public class Today{
    public static void main(String args[]){
        int arr[] = {3,5,6,7,8,9,0,3};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}