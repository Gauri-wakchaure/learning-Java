package staticdemo;

public class StaticVariableDemo {

    static int count = 0;

    public StaticVariableDemo() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticVariableDemo s1 = new StaticVariableDemo();
        StaticVariableDemo s2 = new StaticVariableDemo();
        StaticVariableDemo s3 = new StaticVariableDemo();

        // Added lines to use the local variables
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
