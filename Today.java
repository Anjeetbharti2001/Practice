public class Today{
    public static void main(String args[]){
        // count even number in array element
        int arr[] = { 3,6,8,8,3,5};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if( arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}