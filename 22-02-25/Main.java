class InnerMain {

    static void Static() {
        System.out.println("This is Static ");
    }

    public void Apublic() {
        System.out.println("This is public ");
    }

    private void Aprivate() {
        System.out.println("This is Private");
    }

    public void getprivate() {
        Aprivate();
    }

    protected void Aprotected() {
        System.out.println("This is protected");
    }

    void Adefault() {
        System.out.println("Tzhis is default");
    }

}

class InnerMain_1 extends InnerMain {

    @Override
    public void Apublic() {
        System.out.println("This is overridden public class");
    }
    @Override
    protected void Aprotected() {
        System.out.println("This is overridden protected class ");
    }
    @Override
    void Adefault() {
        System.out.println("This is overridden default class");
    }
    static void Static() {
            System.out.println("This is overridden static class");
        }
        public void Aprivate(){
            getprivate();
            System.out.println("private called ..");
        }
    
    }
    
    public class Main {
        public static void main(String[] args) {
            InnerMain objmain = new InnerMain();
            InnerMain_1 objover = new InnerMain_1();
            objmain.Apublic();
            objover.Apublic();
            System.out.println();
            objmain.Aprotected();
            objover.Aprotected();
            System.out.println();
            objmain.Adefault();
            objover.Adefault();
            System.out.println();
            // objover.getprivate();
            objover.Aprivate();
            System.out.println();
            // objmain.Static();
            // objover.Static();

    }
}
