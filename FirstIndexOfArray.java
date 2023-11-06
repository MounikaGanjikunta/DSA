// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
     public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
        }else{
            return firstIndex(arr,idx + 1,x);
        }
       
    }
    public static void main(String[] args) {
        int[] arr = {15,11,40,4,4,9};
        int firstIndex = firstIndex(arr,0,8);
        System.out.println(firstIndex);
    }
}
