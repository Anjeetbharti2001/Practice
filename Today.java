public class Today{
    public static void main(String args[]){
        int arr[] = {4,5,7,8,2,5};
        int sum = 0; 
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            System.out.println(sum);
        }
    }
}