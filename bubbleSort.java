// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;
        
        //bubble sort
        for(int i = 0; i < n - 1 ; i++){
            for(int j = 0; j < n - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
            }
            
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
