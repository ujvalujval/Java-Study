class Innerinheritanace_1 {
    private int a;
    private int b;

    void show() {
        a = 10;
        b = 20;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class Innerinheritanace_2 extends Innerinheritanace_1 {
    void add() {
        System.out.println("Addition : " + (getA() + getB()));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Innerinheritanace_2 obj = new Innerinheritanace_2();
        obj.show();
        obj.add();
    }
}
