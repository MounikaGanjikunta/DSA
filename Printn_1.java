/* Online Java Compiler and Editor */

import java.io.*;
import java.util.*;
public class printn{

     public static void main(String []args){
         int n = 7;
         print(n);
     }
public static void print(int n){


    if( n == 1)
        System.out.println(1);
    else {
        System.out.println(n + " ");
        print(n-1);
    }
    }
}