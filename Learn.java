public class Learn{
    public static void main(String args[]){
        // sum of array an element 
        int arr[] = {4,6,7,2,31,1,3};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}