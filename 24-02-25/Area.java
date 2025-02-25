abstract class Circle {
    protected double area;

    abstract void calculateArea();
}

class CircleArea extends Circle {
    public int radius;

    public void setRadius(int radius) {
        this.radius = radius; 
    }

    @Override
    void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area : " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        CircleArea obj = new CircleArea();
        obj.setRadius(10);
        obj.calculateArea(); 
    }
}
