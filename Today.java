public class Today{
    public static void main(String args[]){
        int coins[] = {1, 2, 3};
        int amount = 4;

        int dp[] = new int[amount + 1];
        dp[0] = 1;

        for(int i = 0; i<coins.length; i++){
            for(int j = coins[i]; j <= amount; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        System.out.println("Total ways = " + dp[amount]);
    }
}