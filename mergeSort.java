// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
     public static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            conquer(arr, low, high,mid);
        }
    }
    
    public static void conquer(int arr[], int low, int high, int mid){
        int[] merge = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        
        while(idx1 <= mid && idx2 <= high){
            if(arr[idx1] <= arr[idx2]){
                merge[x] = arr[idx1];
                idx1++;
            }else{
                merge[x] = arr[idx2];
                idx2++;
            }
            x++;
        }
        while(idx1 <= mid){
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }
        while(idx2 <= high){
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }
        for(int i = 0,j = low; i < merge.length; i++,j++){
            arr[j] = merge[i];
        }
        
    }
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        mergeSort(arr,0, n-1);
        for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
        }
    }
}
