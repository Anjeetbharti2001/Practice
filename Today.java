public class Today{
    public static void main(String args[]){
        int cost[] = {1,3,5,2};
        int n = cost.length;

        int dp[] = new int[n];

        dp[0] = cost[0];

        for(int i = 1; i < n; i++){
            dp[i] = cost[i] + dp[i - 1];
        }
        System.out.println("Minimum cost :- " + dp[n -1]);

    }
}