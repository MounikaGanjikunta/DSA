// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;
        int smallestidx = 0; 
        
        //selection sort
        for(int i = 0; i < n - 1 ; i++){
            smallestidx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[smallestidx] > arr[j]){
                smallestidx = j;
                }
            }
        
        int temp = arr[i];
        arr[i] = arr[smallestidx];
        arr[smallestidx] = temp;
        } 
        
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
