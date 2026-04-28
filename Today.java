public class Today{
    // java Programming to print star pattern in a reverse triangle shape.
    public static void main(String args[]){
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}