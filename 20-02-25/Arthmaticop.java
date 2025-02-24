class InnerArthmaticop {
    int num1;
    int num2;

    InnerArthmaticop(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void Add() {
        System.out.println("Addition : " + (num1 + num2));

    }

    void Sub() {
        System.out.println("Substraction : " + (num1 - num2));

    }

    void Mul() {
        System.out.println("Multiplication : " + (num1 * num2));

    }

    void Div() {
        System.out.println("Division : " + (num1 / num2));

    }

    void Module() {
        System.out.println("Module : " + (num1 % num2));

    }
}

public class Arthmaticop {
    public static void main(String[] args) {
        InnerArthmaticop obj = new InnerArthmaticop(20, 10);
        obj.Add();
        obj.Sub();
        obj.Mul();
        obj.Div();
        obj.Module();
    }
}