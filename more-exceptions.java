//Question: https://www.hackerrank.com/challenges/30-more-exceptions/problem


import java.lang.Math;
class Calculator{
    int power(int n,int p) throws Exception{
if(n<0 || p<0){
throw new  Exception("n and p should be non-negative");
    }
    else{
        double result=Math.pow((double)n,(double)p);
        return (int) result;
    }
}
}
//Write your code here

