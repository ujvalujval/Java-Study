interface Interface1 {
    static void display1() {
        System.out.println("This is static method");
    }

    default void display2() {
        System.out.println("This is default method");
    }

    void display3();
}

interface Interface2 extends Interface1 {
    static void display1() {
        System.out.println("This is second static method");
    }

    default void display2() {
        System.out.println("This is second default method");
    }

    void display3();
}

class Show implements Interface2 {

    static void display1() {
        System.out.println("This is also a static method");
    }

    public void display2() {
        System.out.println("This is overridden default method in class");
    }

    public void display3() {
        System.out.println("This is Abstarct Method");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Show obj = new Show();

        Interface1.display1();
        Interface2.display1();
        Show.display1();

        obj.display2();

        obj.display3();

    }
}