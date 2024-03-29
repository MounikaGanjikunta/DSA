// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set);
                return;
            }
            return;
        }
        
        
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ",",sos + arr[idx],tar);
        printTargetSumSubsets(arr, idx + 1, set, sos,tar);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int tar = 70;
        printTargetSumSubsets(arr,0,"",0,tar);
    }
}
