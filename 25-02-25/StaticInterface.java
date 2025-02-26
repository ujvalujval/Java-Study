
interface Animal {

    static void dog() {
        System.out.println("This is Animal");
    }

    void sleep();

    default void cat() {
        System.out.println("This is also Animal");
    }
}

class cat implements Animal {
    public void sleep() {
        System.out.println("Cat and dog  are  Sleeping");
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        Animal.dog();
        cat obj = new cat();
        obj.cat();
        obj.sleep();
    }

}