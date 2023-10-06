// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static int knapSackRec(int profit[], int weight[], int W, int n, int[][] dp){
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        
        if(weight[n-1] <= W){
            return dp[n][W] = Math.max((profit[n - 1] + knapSackRec(profit, weight, W - weight[n - 1], n - 1, dp)),knapSackRec(profit,weight,W, n - 1, dp));
        }else{
            return dp[n][W] = knapSackRec(profit,weight,W, n - 1, dp);
        }
    }
    
    static int knapSack(int wt[], int val[],int W, int n)
    {
 
        // Declare the table dynamically
        int dp[][] = new int[n + 1][W + 1];
 
        // Loop to initially filled the
        // table with -1
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;
 
        return knapSackRec(wt, val,W, n, dp);
    }
    
    
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(profit,weight,W,n));
    }
}
