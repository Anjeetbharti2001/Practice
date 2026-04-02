public class Today{
    public static void main(String args[]){
        int arr[] = {2,4,6,7};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum/arr.length;
        System.out.println("total avg " + avg);
    }
}