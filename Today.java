public class Today{
    public static void main(String args[]){
        int arr[] = {4,6,7,8,9};
        int count = 0;

        for(int i = 0 ;i<arr.length; i++){
            if(arr[i] %2 == 0){
                count++;
            }
        }
        System.out.println(" Total even number:-" + count);
    }
}