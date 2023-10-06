// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int knapsack(int profit[], int weight[], int W, int n){
        if(n == 0 || W == 0){
            return 0;
        }
        
        if(weight[n-1] <= W){
            return Math.max((profit[n - 1] + knapsack(profit, weight, W - weight[n - 1], n - 1)),knapsack(profit,weight,W, n - 1));
        }else{
            return knapsack(profit,weight,W, n - 1);
        }
    }
    
    
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapsack(profit,weight,W,n));
    }
}
