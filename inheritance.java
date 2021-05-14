//Question: https://www.hackerrank.com/challenges/30-inheritance/problem



class Student extends Person{
	private int[] testScores;
    Student(String firstName,String lastName,int identification,int[] testScores){
        super(firstName,lastName,identification);
        this.testScores=testScores;
        

    }
    public String calculate(){
        int sum=0; String g;
        for(int i=0;i<testScores.length;i++){
                   sum+=testScores[i];
        }
        int total=sum/testScores.length;
        if(total>=90){
           g= "O";
        }else if(total>=80){
          g="E";
        }else if(total>=70){
           g= "A";
        }else if(total>=55){
          g= "P";
        }else if(total>=40){
           g= "D";
        }else{
          g= "T";
        }
return g;
    }

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

