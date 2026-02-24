public class Today{
    public static void main(String args[]){
        int arr[] = {4,7,9,2,4};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){// check odd number
                count++;
            }
        }
        System.out.println(count);
    }
}