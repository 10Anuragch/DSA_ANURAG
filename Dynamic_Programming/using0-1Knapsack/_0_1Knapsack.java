// package using0-1Knapsack;

//usind dp(memoization)--method solved in class
public class _0_1Knapsack {
    public static int Knapsack(int val[], int wt[], int W, int n,int dp[][]) {//where W is the capacity of knapsack and n is the each particular item
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {// valid
            // this case is for include
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1,dp);
            // this case is for exclude
            int ans2 = Knapsack(val, wt, W, n - 1,dp);

            dp[n][W]=Math.max(ans1, ans2);
            return dp[n][W];
        } 
        else {//not valid
            dp[n][W]=Knapsack(val, wt, W, n - 1,dp);
            return dp[n][W];
        }
    }
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(Knapsack(val, wt, W, val.length,dp));
    }
}
