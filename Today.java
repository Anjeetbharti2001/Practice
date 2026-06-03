// find the index of the largest number in an arrays
public class Today{
    public static void main(String args[]){
        int a[] = new int[]{12,44,23,56,23,78,13};
        int max = a[0];
        int index = 0;
        for(int i = 0; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
                index = i;
            }
        }
        System.out.println("Indext Position of Maximum value in an is : " + index);
    }
}