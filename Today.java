public class Today{
    public static void main(String args[]){
        int n =  5;
        int dp[] = new int[n + 1];

        dp[0] = 1;

        for(int i = 1; i<= n; i++){
            dp[i] = i * dp[i - 1];
        }
        System.out.println("Factorial = " + dp[n]);
    }
}