public class Today{
    public static void main(String args[]){
        // find out the count even number 
        int arr[] = {2,6,7,8,2,4,6};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}