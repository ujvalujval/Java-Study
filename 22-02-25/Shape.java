
class InnerShape {

    double calculateArea() {
        return 0;
    }

}

class InnerShape_1 extends InnerShape {
    int radius;

    InnerShape_1(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pie = 3.14;
        return pie*(radius * radius);
    }

}

class InnerShape_2 extends InnerShape {
    int width, length;

    InnerShape_2(int width, int length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}

public class Shape {
    public static void main(String[] args) {
        InnerShape_1 circle = new InnerShape_1(4);
        System.out.println("Area of circle : " + circle.calculateArea());
        InnerShape_2 rectangle = new InnerShape_2(4, 5);
        System.out.println("Area of Rectangle : " + rectangle.calculateArea());
    }

}
