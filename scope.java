//Question: https://www.hackerrank.com/challenges/30-scope/problem


         Difference(int[] a){
             this.elements=a;
             
         }
         void computeDifference(){
             int n=elements.length-1;
           Arrays.sort(elements);
            maximumDifference=elements[n]-elements[0];
         }
        
	// Add your code here

