class InnerSuperclass {
    String Name;

    InnerSuperclass() {
        Name = "Parent";
    }
    InnerSuperclass(int x) {
        System.out.println("Super class x value called :"+x);
    }
}

class InnerSuperclass_1 extends InnerSuperclass {
    String Name;

    InnerSuperclass_1() {
        Name = "Child";
    }

    InnerSuperclass_1(int x) {
        System.out.println("Sub class paramterized called : " + x);
    }

    void display() {

        System.out.println("Super class Called : " + super.Name);
        System.out.println("Sub class also called : " + Name);
    }

}

public class Superclass {
    public static void main(String[] args) {
        InnerSuperclass_1 obj = new InnerSuperclass_1(10);
        obj.display();
    }
}
