class InnerInnerClass_2 {

    final class InnerClass_1 {
        static void display() {
            System.out.println("This is inner class..");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        InnerInnerClass_2.InnerClass_1.display();
    }
}
