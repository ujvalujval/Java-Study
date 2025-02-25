
public class Addtwonos {

    private int a;
    private int b;

    Addtwonos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        int c = a + b;
        System.out.println("Addition : " + c);
    }

    public static void main(String[] args) {
        Addtwonos obj = new Addtwonos(3 , 4);
        obj.sum();

    }
}
