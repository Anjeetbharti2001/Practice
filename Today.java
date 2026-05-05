public class Today {
    public static int knapsack(int[] wt, int[] val, int w, int n) {
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i <= n; i++) {
            for (int W = 0; W <= w; W++) {

                if (i == 0 || W == 0) {
                    dp[i][W] = 0;
                }
                else if (wt[i - 1] <= W) {
                    dp[i][W] = Math.max(
                        val[i - 1] + dp[i - 1][W - wt[i - 1]],
                        dp[i - 1][W]
                    );
                }
                else {
                    dp[i][W] = dp[i - 1][W];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String args[]) {
        int wt[] = {1, 2, 3};
        int val[] = {10, 15, 40};
        int w = 6;

        System.out.println(knapsack(wt, val, w, wt.length)); // 65
    }
}