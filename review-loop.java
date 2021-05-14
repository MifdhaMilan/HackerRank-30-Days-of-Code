//Question: https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner  sc=new Scanner(System.in);
       int i,j,k;
       int t=sc.nextInt();
       for(k=0;k<t;k++){
           String s=sc.next();
           for(i=0;i<s.length();i+=2){
                   System.out.print(s.charAt(i));
               
           }
           System.out.print(" ");
            for(j=1;j<s.length();j+=2){
                   System.out.print(s.charAt(j));
               
           }
         System.out.println();
       }
    }
}
