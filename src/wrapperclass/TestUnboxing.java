package wrapperclass;

public class TestUnboxing {

    public static void main(String[] args) {

        // Auto-unboxing
        Double d1 = 49.00;
        double d = d1;
        System.out.println("d is : " + d);

        //  unboxing
        Double d2 = 60.00;
        double obj = d2.doubleValue();
        System.out.println("object is : " + obj);
    }
}
