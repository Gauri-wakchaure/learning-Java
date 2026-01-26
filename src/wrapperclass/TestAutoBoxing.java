package wrapperclass;

public class TestAutoBoxing {

    public static void main(String[] args) {

        // Auto-boxing
        int a = 10;
        Integer b = a;
        System.out.println("B is : " + b);

        // Manual boxing
        int x = 2;
        Integer y = Integer.valueOf(x);
        System.out.println("Y is : " + y);
        
        float f=12;
        Float f1 =f;
        float f3=f1;
        
        System.out.println("Object is f3 :"+f3);
        
        float f4=f1.floatValue();
        System.out.println("Object is f4 :"+f4);

        
        
        
        
    }
}
