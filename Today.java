//what is the exact output of the program below. Indicate a blank line in the output by writing blank line

public class Today{
    public static void main(String args[]){
        int n = 4, k = 2;

        System.out.println(++n);
        System.out.println(n);

        System.out.println(n++);
        System.out.println(n);

        System.out.println(-n);
        System.out.println(n);     

        System.out.println(--n);
        System.out.println(n);

        System.out.println(n--);      
        System.out.println(n);

        System.out.println(n + k);    
        System.out.println(n);
        System.out.println(k);        
        System.out.println("" + n + " " + k );

        System.out.println(n);       
        System.out.println(" " + n );
        System.out.println(" n");
        System.out.println("\n");

        System.out.println(" n * n = "); // careful!
        System.out.println(n * n);
        System.out.println('n');
    }

}