public class Today{
    static void even(int n ){
        if(n == 0)
            return ;

        even(n - 1);

        if(n % 2 == 0)
            System.out.println(n + " ");
    }
    public static void main(String args[]){
        even(10);
    }
}