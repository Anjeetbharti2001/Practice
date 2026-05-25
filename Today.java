public class Today{
    public static void main(String args[]){
        int n = 10; // 1010
        int i = 2;

        int bit = (n >> i) & 1;

        System.out.println("Bit = " + bit );
    }
}