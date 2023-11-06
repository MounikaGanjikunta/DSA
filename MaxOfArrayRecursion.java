// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        if(arr[idx] > maxOfArray(arr,idx + 1)){
            return arr[idx];
        }else{
            return maxOfArray(arr,idx + 1);
        }
       
    }
    public static void main(String[] args) {
        int[] arr = {15,30,40,4,11,9};
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }
}
