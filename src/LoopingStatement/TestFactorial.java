package LoopingStatement;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int fact =1;
      
      for(int i=1; i<=5; i++)
      {
    	  fact*=i;
    	  //fact = fact *i;
      }
      System.out.println("Factorial number of 5 :" + fact);
	}

}
