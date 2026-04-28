public class Today{
    public static void main(String args[]){
        int limit = 50;
        System.out.println("Printing Even number between 1 and " + limit);
        for(int i = 1; i<= limit; i++){
            // if the number is divisible by 2 then it is even 
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
    }
}