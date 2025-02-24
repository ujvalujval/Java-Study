public class carbrand {

    String brand;

    carbrand() {
        brand = "Unknown";
        System.out.println("Brand Name : " + brand);
    }

    void setBrand() {
        brand = "Audi";
        System.out.println("Brand updated : " + brand);
    }

    public static void main(String[] args) {
        carbrand obj = new carbrand();
        obj.setBrand();
    }
}

// create a counter class with static variable that keeps track of how many
// objects have been created use default constructor to increment the counter
// each time a new obj is created.