// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int count_triplets(int[] arr, int d){
        int n = arr.length;
        int count = 0;

    for (int i = 0; i < n; i++){
        for(int j = i + 1; j < n;j++){
            for(int k = j + 1; k < n; k++){
                 if((arr[i] + arr[j] + arr[k]) % d == 0)
                     count += 1;
            }
        }
    }

    return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {3,3,4,7,8};
        System.out.println(count_triplets(arr,5));
    }
}
