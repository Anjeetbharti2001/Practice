public class Today{
    public static void main(String args[]){
        // check if element exist in array
        int arr[] = {4,7,8,3,9};
        int key = 8; // jis bh element ko check karna ho 
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
               found = true; 
                break; 
            }
        }
        if(found){
            System.out.println("Element exist i array");
        }else{
            System.out.println("Element not found");
        }

    }
}