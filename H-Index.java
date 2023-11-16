class Solution {
    public int hIndex(int[] citations){

     Arrays.sort(citations);
     int n = citations.length;
   
     int idx = 0 ;

     while(idx < n &&  n-idx >citations[idx]){
         idx++;
     }

    return n-idx;
}
}
