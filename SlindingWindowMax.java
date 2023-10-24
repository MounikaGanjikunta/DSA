//Stacks problem - sliding window maximum

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

   int n = 9;
   int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6,4};
  
   int k = 4;

   int[] nge = new int[arr.length];
   Stack<Integer> st = new Stack<>();
   st.push(arr.length - 1);
   nge[arr.length - 1] = arr.length;
   
   for(int i = arr.length - 2; i >= 0; i--){
       while(st.size() > 0 && arr[st.peek()] <= arr[i]){
           st.pop();
       }
       if(st.size() == 0){
           nge[i] = arr.length;
       }else{
           nge[i] = st.peek();
       }
       
       st.push(i);
       
   }
    int j = 0;
    for(int i = 0; i < arr.length - k; i++){
      if(j < i){
        j = i;
      }

      while(nge[j] <  i + k){
        j = nge[j];
      }
      System.out.println(arr[j]);
    }
   
   
  // return nge;
}
 }
