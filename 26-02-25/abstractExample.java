
abstract class outerabstract {

    abstract void display1();

    void display2() {
        System.out.println("displaying from outer non-abstract method");
    }

    abstract class innerabstract {
        abstract void display3();

        public void display4() {
            System.out.println("displaying from inner non-abstract method");
        }
    }
}

class show extends outerabstract {

    public void display1() {
        System.out.println("This is abstarct outer display");
    }
    class showInner extends innerabstract {
    
        public void display3() {
            System.out.println("This is inner abstract class");
        }
    
        // showInner(outerabstract outer) {
        //     outer.super();
        // }
    }
}


public class abstractExample {
    public static void main(String[] args) {
        show obj = new show();
        obj.display1();
        obj.display2();

        show.showInner obj2 = obj.new showInner();
        obj2.display3();
        obj2.display4();
    }
}