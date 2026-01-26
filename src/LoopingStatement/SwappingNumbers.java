package LoopingStatement;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
      int b=20;
      
      int temp=a;
      a=b;
      b=temp;
      
      System.out.println("Using 3rd Variable");
      System.out.println("After Swapping Value of a :" + a );
      System.out.println("After Swapping Value of b :" + b );
      
      System.out.println();
      System.out.println("Without Using Third Variable" );
      
      a=a+b;
      b=a-b;
      a=a-b;
      
      
      System.out.println("After Swapping Value of a :" + a );

      System.out.println("After Swapping Value of b :" + b);
      


	}

}
