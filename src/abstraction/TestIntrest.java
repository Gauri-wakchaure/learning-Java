package abstraction;

abstract class Bank {
    abstract int interestRate();
}

class SBI extends Bank {
    public int interestRate() {
        return 5;
    }
}

class Axis extends Bank {
    public int interestRate() {
        return 8;
    }
}

class HDFC extends Bank {
    public int interestRate() {
        return 9;
    }
}

public class TestIntrest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("Rate of interest :" + b.interestRate() + "%");

        b = new Axis();
        System.out.println("Rate of interest :" + b.interestRate() + "%");

        b = new HDFC();
        System.out.println("Rate of interest :" + b.interestRate() + "%");
    }
}
