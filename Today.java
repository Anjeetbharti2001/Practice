// public class Today{
//     public static void main(String args[]){
//         int arr[] = {4,6,7,9,0,2,3};


//         int sum = 0;

//         // loop to add all element
//         for(int i = 0; i<arr.length; i++){
//              sum = sum + arr[i];
//         }
//         // calculate average element 
//         double average = (double) sum / arr.length;
//         System.out.println("Total average element:-" + average);
        
//     }
// }

public class Today{
    public static void main(String args[]){
        int arr[] = {3,6,7,8,9};

        int sum = 0;
        
        //loop to add all element
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // calculate average element 
        double average = (double) sum / arr.length;
        System.out.println("Total avearge element :- " + average);
    }
}