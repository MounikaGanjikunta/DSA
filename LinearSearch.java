// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static int linearSearch(int arr[], int num){
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,7,3,6,4,5};
        int n = arr.length;
        
        int index = linearSearch(arr, 7);
        
        if(index == -1){
            System.out.println("number not found");
        }else{
            System.out.println("number found at index " + index);
        }
        
       
    }
}
