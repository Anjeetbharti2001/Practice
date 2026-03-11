// check of the string in any particular word exist yes or not 
public class Today{
    public static void main(String args[]){
        String str = "java is a programing language";
        String word = "Anjeet";

        if(str.contains(word)){
            System.out.println("Word exist");
        }else{
            System.out.println("word is not exist");
        }
    }
}