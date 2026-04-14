public class Today{
    public static void main(String args[]){
        // average element in java
        int arr[] = {3,5,6,7,8,8,9,9};
        int sum = 0; 

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        //average element in java
        double avg = (double) sum/arr.length;
        System.out.println(" Average element in arrays:-" + avg);
    }
}