class Innerconstruex {
    String BookTitle;
    float price;

    Innerconstruex(String BookTitle, float price) {
        this.BookTitle = BookTitle;
        this.price = price;
    }

    void display() {
        System.out.println("BookTitle : " + BookTitle);
        System.out.println("Price : " + price);
    }

}

public class construex {

    public static void main(String[] args) {
        Innerconstruex obj = new Innerconstruex("Java Programming", 100.00f);
        obj.display();
    }
}

// create book class with instance var title and price use default constructor
// to assign java prog- title and 100.0 as price;
// display these val when obj is created;