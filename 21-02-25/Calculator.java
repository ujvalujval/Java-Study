
class InnerCalculator {
    int a = 10, b = 5;

    void add() {
        System.out.println("Addition : " + (a + b));
    }

    void Sub(int a, int b) {
        System.out.println("Substraction : " + (a - b));
    }

    int Mul() {
        return a * b;
    }

    int Div(int a, int b) {
        return a / b;
    }
}

public class Calculator {

    public static void main(String[] args) {
        InnerCalculator obj = new InnerCalculator();
        obj.add();
        obj.Sub(10, 5);
        System.out.println("Multiplication : " + obj.Mul());
        System.out.println("Division : " + obj.Div(10, 5));

    }

}

// create two classes with class name leftangle and rigthangle which prints leftangle and rigthangle.call the objects and display the triangles;
