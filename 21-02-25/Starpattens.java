
class LeftAngleTriangle {

    void leftstar() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}

class RigthAngleTriangle {

    void rigthstar() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = n - i; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

public class Starpattens {

    public static void main(String[] args) {
        LeftAngleTriangle obj1 = new LeftAngleTriangle();
        obj1.leftstar();
        System.out.println();
        RigthAngleTriangle obj2 = new RigthAngleTriangle();
        obj2.rigthstar();

    }

}
