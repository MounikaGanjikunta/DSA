// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static int partition(int arr[], int low, int high){
        int pIndex = low;
        int pivot = arr[high];
        
        for(int i = low; i < high; i++){
            if(arr[i] <= pivot){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex = pIndex + 1;
            }
        }
        int temp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = temp;
        
        return pIndex;
    }
    
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
