class InnerMultilevel {

    private void display() {
        System.out.println("This is super most  class");
    }

    public void getdisplay() {
        display();
    }

}

class InnerMultilevel_1 extends InnerMultilevel {

    protected void displaysuperclass() {
        // getdisplay();
        System.out.println("This is super  class");
    }

}

class InnerMultilevel_2 extends InnerMultilevel_1 {

    void displaysubclass() {
        System.out.println("This is Sub class");
    }

}

public class Multilevel {
    public static void main(String[] args) {
        InnerMultilevel_2 obj = new InnerMultilevel_2();
        obj.getdisplay();
        obj.displaysuperclass();
        obj.displaysubclass();
    }
}

