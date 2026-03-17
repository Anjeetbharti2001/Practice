public class Today{
    public static void main(String args[]){
        int arr[] = {6,8,10,2,5,3,1};
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        //print reversed array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// output reversed arrar:- 1,3,5,2,10,8,6
