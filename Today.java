public class Today{
    static boolean isPalindrome(String str){
         int start = 0;
         int end = str.length()-1;

         while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
         }
         return true;
    }
    public static void main(String args[]){
         String str = "madam";
         if(isPalindrome(str)){
            System.out.println("yes, palindrome");
         }else{
            System.out.println("no, not palindrime");
         }
    }
}