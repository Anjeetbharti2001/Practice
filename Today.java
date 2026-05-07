public class Today{
    public static void main(String args[]){
        String str = "jahaj";
        String rev = "";

        for(int i = str.length() - 1; i>= 0 ; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
    }
}