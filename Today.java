public class Today{
    public static void main(String args[]){
        int arr[] = {3,6,9,3,6};
        int sum = 0; 
        // Loop to add all element 
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // Calculate average
        double average = (double) sum/arr.length;
        System.out.println("Avarage:-" + average);
    }
}