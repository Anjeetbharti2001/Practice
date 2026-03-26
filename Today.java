public class Today{
    public static void main(String args[]){
        int arr[] = {4,7,9,9,3};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // average element in array
        double avg = (double) sum/arr.length;
        System.out.println(avg);
    }
}