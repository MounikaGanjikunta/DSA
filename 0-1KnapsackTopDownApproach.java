// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int knapsack(int profit[], int weight[], int W, int n){
        
        int K[][] = new int[n + 1][W + 1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < W + 1; j++){
                if(i == 0 || j == 0){
                    K[i][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W + 1; j++){
                if(weight[i - 1] <= j){
                    K[i][j] = Math.max(profit[i - 1] + (K[i - 1][j - weight[i - 1]]),
                                K[i - 1][j]);
                }else{
                    K[i][j] = K[i - 1][j];
                }
                
            }
            
        } 
        
       return K[n][W];
    }
    
    
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapsack(profit,weight,W,n));
    }
}
