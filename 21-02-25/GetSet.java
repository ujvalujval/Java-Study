import java.util.Scanner;

class InnerGetSet {
    private int a, b, c;

    private void getval() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a Value :");
        a = input.nextInt();
        System.out.print("Enter the b Value :");
        b = input.nextInt();
        input.close();
    }

    public void sum() {
        getval();
        c = a + b;
        System.out.println("Addition : " + c);
    }

}

public class GetSet {

    public static void main(String[] args) {
        InnerGetSet obj = new InnerGetSet();
        obj.sum();

    }

}
