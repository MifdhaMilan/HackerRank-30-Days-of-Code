//Question: https://www.hackerrank.com/challenges/30-interfaces/problem


class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int su=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0){
             su+=i;
            }
        }
        return su;
    }
}

