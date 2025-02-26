class areas {
    int a;
    int b;

    areas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void Calculate() {
        System.out.println("Addition : " + (a + b));
    }

    void Calculate(int l, int b) {
        System.out.println("Substraction : " + (l - b));
    }

    void Calculate(int a) {
        System.out.println("Multiplication : " + (a * a));
    }

    void Calculate(double num1, double num2) {
        System.out.println("Division : " + (num1 / num2));
    }
}

public class methodOverLoad {
    public static void main(String[] args) {
        areas obj = new areas(10, 10);
        obj.Calculate();
        obj.Calculate(5);
        obj.Calculate(10, 5);
        obj.Calculate(10.0, 5.0);

    }
}
