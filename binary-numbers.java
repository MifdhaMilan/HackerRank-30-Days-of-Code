//Question: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
       int z=n;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int count=0; 
        while(z>0){
            z=z/2;
            count++;

        }
        int[] arr=new int[count];
       for(int i=0;i<arr.length;i++){
           arr[i]=n%2;
           n/=2;

       }
          int max=0,x,con=1;
       for(x=0;x<arr.length-1;x++) {
           if(arr[x]==arr[x+1]) {
               con++;
               
           }
           if(arr[x]==0) {
               con=1;
           }
           if(con>max) {
               max=con;
           }
           
       }
       
System.out.println(max);
    }
}
