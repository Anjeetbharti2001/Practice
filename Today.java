public class Today{
    public static void main(String args[]){ 
        int wt[] = {1,2,3};
        int val[] =  {10, 15, 40};
        int W = 6;

        int n = wt.length;
        int dp[][] = new int [n + 1][W + 1];

        for(int i = 1; i<= n; i++){
            for(int w = 1; w <= W; w++){
                if(wt[i - 1] <= w){
                    int include = val[i - 1] + dp[i - 1][w - wt[i - 1]];

                    int exclude = dp[i - 1][w];
                    dp[i][w] = Math.max(include, exclude);
                }else{
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println("Maximum profit :- " + dp[n][W]);

    }
}