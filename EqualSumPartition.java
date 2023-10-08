// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static boolean isSubsetSum(int[] arr,int n, int sum){
        if(sum%2 != 0){
            return false;
        }
        sum = sum/2;
        boolean subset[][] = new boolean[n + 1][sum + 1];
        for(int j = 0; j < sum + 1; j++){
            subset[0][j] = false;
        }
        for(int i = 0; i < n + 1; i++){
            subset[i][0] = true;
        }
        
        for(int i = 1; i < n +1; i++){
            for(int j = 1; j < sum + 1; j++){
                if(arr[i - 1] <= j){
                    subset[i][j] = subset[i - 1][j - arr[i - 1]] || subset[i - 1][j];
                }else{
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }
        return subset[n][sum];
        
    }
    
        
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 9, 12 };
        int sum = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];//30
        }
        
        
        if (isSubsetSum(arr, n, sum) == true)
        System.out.println("Found a subset"
                           + " with given sum");
        else
        System.out.println("No subset with"
                           + " given sum");
        
        
    }
    
}
