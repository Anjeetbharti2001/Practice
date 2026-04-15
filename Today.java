public class Today{
    public static void main(String args[]){
        int arr[] = {2,6,7,8,9};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // average element in arrays
        double avg = (double)sum/arr.length;
        System.out.println("Total average element in arrays:-" + avg);
    }
}