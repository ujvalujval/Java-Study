public class counterObj {
    static int counter = 0;

    counterObj() {
        counter++;
        System.out.println("Object Created : count : " + counter);
    }

    public static void main(String[] args) {
        new counterObj();
        new counterObj();
        new counterObj();
        new counterObj();
    }
}


//// create a counter class with static variable that keeps track of how many
//// objects have been created use default constructor to increment the counter
//// each time a new obj is created.