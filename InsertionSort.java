// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;
        
        //Insertion sort
        for(int i = 1; i < n; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // here j becomes -1, hence add 1 and place current
        } 
        
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
