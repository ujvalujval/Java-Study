public class bookprice {

    String BookTitle;
    String Author;
    float prize;

    bookprice(String a, String b, float c) {
        BookTitle = a;
        Author = b;
        prize = c;
    }

    void display() {
        System.out.println("Book Title : " + BookTitle);
        System.out.println("Author Name : " + Author);
        System.out.println("Book Prize : " + prize);
    }

    public static void main(String[] args) {
        bookprice obj = new bookprice("Java Programming", "java", 100.0f);
        obj.display();

    }
}
