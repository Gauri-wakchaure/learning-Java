package finalkeyword;

final class MathOperation
{
   static int add(int a, int b)
   {
       return a + b;
   }

   static int sub(int a, int b)
   {
       return a - b;
   }
}

public class DemoFinalClass
{
    public static void main(String[] args)
    {
        System.out.println(MathOperation.add(67, 77));
        System.out.println(MathOperation.sub(78, 32));
    }
}
