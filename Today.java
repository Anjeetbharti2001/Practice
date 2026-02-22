public class Today{
    public static void main(String args[]){
        // check odd number in array
        int arr[] = {5,8,9,3,5};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){//check odd here
              count++;
            }
        }
        System.out.println(count);
    }
}