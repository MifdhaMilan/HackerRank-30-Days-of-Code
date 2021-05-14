//Question: https://www.hackerrank.com/challenges/30-class-vs-instance/problem



public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge>0){
          this.age=initialAge;
          }else{
              this.age=0;
              System.out.println("Age is not valid, setting age to 0.");
          }
	}

	public void amIOld() {
  		if(age>=18){
            System.out.println("You are old.");  
          }else if(age>=13){
                System.out.println("You are a teenager.");
          }else{
        System.out.println("You are young.");
          }
	}

	public void yearPasses() {
  		age++;
	}

