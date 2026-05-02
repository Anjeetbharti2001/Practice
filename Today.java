public class Today{
    public static void main(String args[]){
        //Immutable String 
        String s = "Hello Anjeet beta";
        System.out.println(s);

        //Mutable String builder
        StringBuilder sb = new StringBuilder("Hello" + " ");
        sb.append("Anjeet");
        System.out.println(sb.toString());
    }
}