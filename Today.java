public class Today{
    public static void main(String args[]){
        // average number
        int arr[] = {3,6,9,2,4};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // average
        double avg = (double) sum / arr.length;
        System.out.println(" Total average number:-" + avg);
    }
}