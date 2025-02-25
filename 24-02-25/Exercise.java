public class Exercise {
    final int a;

    Exercise(int a){
        this.a = a;
    }
   final void display(){
        System.out.println("A : "+a);
    }

    void display(int a , int b){
        int c = a +b;
        System.out.println("value : "+c);
    }

    final void display(int a){
        int result = a*10;
        System.out.println("val : "+result);

    }

    public static void main(String[] args) {
        Exercise obj = new Exercise(10);
        obj.display();
        obj.display(5, 5);
        obj.display(10);
    }
}


