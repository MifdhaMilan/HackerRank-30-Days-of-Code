//Question: https://www.hackerrank.com/challenges/30-sorting/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        // Write Your Code Here
        int count=0,temp;
        for(int x=0;x<n;x++){
            for(int j=x+1;j<n;j++){
                if(a[x]>a[j]){
                    temp=a[x];
                    a[x]=a[j];
                    a[j]=temp;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in "+ count+" swaps.");
        System.out.println("First Element: "+a[0]);
         System.out.println("Last Element: "+a[n-1]);



    }
}
