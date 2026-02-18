//count  odd number in Array 
public class Thursday{
    public static void main(String args[]){
        int arr[] = {4,2,6,8,2,3};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] %  2 !=0){// odd check
               count++;
            }
        }
        System.out.println("Total odd number :-" + count );
    }
}