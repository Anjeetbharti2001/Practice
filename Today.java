// count character in string 

public class Today{
    public static void main(String args[]){
        String str = "Anjeet bharti";

        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Characters : " + count);
    }
}