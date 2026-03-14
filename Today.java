public class Today{
    public static void main(String args[]){
        // count even number in array
        int arr[] = {9,6,2,25,53,6};
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}