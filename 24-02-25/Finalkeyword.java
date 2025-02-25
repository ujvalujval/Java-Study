
public class Finalkeyword {

    // final int a = 100;

    final void display() {
       int  a = 200;
        System.out.println("A value : " + a);
    }

    final void display(int value){
        System.out.println("A value : "+value);
    }
    public static void main(String[] args) {
        Finalkeyword obj = new Finalkeyword();
        obj.display();
        obj.display(44);
        try{
            int val = 10/0;
            System.out.println("val is : "+val);
        }
        catch(ArithmeticException e){
            System.out.println("Error : "+e);
        }
        finally{
            System.out.println("Code executes..");
        }
        
    }
}


