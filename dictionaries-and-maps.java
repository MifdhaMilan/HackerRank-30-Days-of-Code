//Question: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
           
            // Write code here
            
                String s = in.next();
                if(map.get(s)!=null){
                System.out.println(s+"="+map.get(s));
                
                }
                else{
                System.out.println("Not found");
            }
    
       }
          }
}
