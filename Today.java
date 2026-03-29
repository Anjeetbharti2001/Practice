// Reverse a string using recursion
public class Today{
    static void reverse(String str){
        // Base condition
        if(str.length() == 0){
            return;
        }
        // Recursive call 
        reverse(str.substring(1));
        // Print first character at last
        System.out.print(str.charAt(0 ));
    }
    public static void main(String args[]){
        String str = "ANJEET";
        reverse(str);
    }
}