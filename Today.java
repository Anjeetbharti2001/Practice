// Find largest and Smallest number in an arrays in java
public class Today{
    public static void main(String args[]){
        int a[] = new int[]{23,34,13,64,72,90,10,15,9,27};
        int min = a[0]; // assume first elements as smallest number
        int max = a[0]; // assume first element as largest number

        for(int i = 1; i<a.length; i++){
            if(a[i]> max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Largest Number in a given arrays is :" + max);
        System.out.println("Smallest number in a given array is : " + min);
    }
}