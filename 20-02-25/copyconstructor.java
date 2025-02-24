
public class copyconstructor {

    int width;
    int length;

    copyconstructor(int wt, int lt) {
        width = wt;
        length = lt;
    }

    copyconstructor(copyconstructor other) {
        length = other.length;
        width = other.width;
    }

    void display() {
        System.out.println("Width  : " + length);
        System.out.println("Heigth : " + width);
    }

    public static void main(String[] args) {
        copyconstructor obj = new copyconstructor(10, 20);
        copyconstructor obj2 = new copyconstructor(obj);
        obj.display();
        obj2.display();

    }
}
