package constructor;

class ConstructorCallTest
{
    public ConstructorCallTest()   // default constructor
    {   
        this(10);   // calling parameterized constructor
        System.out.println("Default Constructor");
    }
    
    public ConstructorCallTest(int id)   // parameterized constructor
    {
        System.out.println("Parameterized Constructor : " + id);
    }
}

public class CallConstructor {
    public static void main(String[] args) {
        ConstructorCallTest c = new ConstructorCallTest();
        c.toString();
    };
}
