import java.util.Scanner;

public class creatingobj {

    public int a, b, c;

    void display() {
        // c = a+b;
        System.out.println("Addition : " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        creatingobj obj = new creatingobj();
        obj.a = input.nextInt();
        obj.b = input.nextInt();
        obj.c = obj.a + obj.b;
        obj.display();

        input.close();
    }
}
