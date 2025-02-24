class Innerfunctionscon {
    int num1;
    int num2;

    Innerfunctionscon(int num1 , int num2){
            this.num1 = num1;
            this.num2 = num2;
    }

    void addition() {
        System.out.println("Ad :" + (num1 + num2));
    }

    void Substraction(int a, int b) {
        System.out.println("Sub : " + (a - b));
    }

    int Multiplication() {
        return num1 * num2;
    }

    int Division(int val1, int val2) {
        return val1 / val2;
    }
}

public class functionscon {
    public static void main(String[] args) {
        Innerfunctionscon obj = new Innerfunctionscon(10 , 20);
        obj.addition();
        obj.Substraction(10, 5);
        System.out.println("Multi : " + obj.Multiplication());
        System.out.println("Div : " + obj.Division(10, 5));
    }
}
