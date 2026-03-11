public class Today{
    public static void main(String args[]){
        String str = "Java Is Easy To Learn";
        String [] words =str.split(" ");

        for(int i = 0; i<words.length; i++){
            String first = words[i].substring(0,1).toLowerCase();
            String rest = words[i].substring(1);
            words[i] = first + rest;
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}