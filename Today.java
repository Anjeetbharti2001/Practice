public class Today{
    // recursive function
    static void reverse(String str){
        // base condition
        if(str.length() == 0 ){
            return;
        }
        //recursive call 
        reverse(str.substring(1));
        // print first character at last 
        System.out.print(str.charAt(0)+ " ");
    }
    public static void main(String args[]){
           String str = "hello";
           reverse(str);
    }
}