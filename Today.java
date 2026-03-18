public class Today{
    public static void main(String args[]){
        int arr[] = {5,3,5,6,9,2,4};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum/arr.length;
        System.out.println("Average :- " + avg);
    }
}