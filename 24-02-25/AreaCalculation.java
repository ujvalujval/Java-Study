
public class AreaCalculation {
    abstract class circle {

        public static void calArea(double radius) {
            double area = 3.14 * radius * radius;
            System.out.println("Area of Circle :" + area);
        }
    }

    abstract class Square {
        public static void calArea(double side) {
            double area = 2 * 3.14 * side;
            System.out.println("Area of Circumference : " + area);
        }
    }

    public static void main(String[] args) {
        circle.calArea(4);
        Square.calArea(4);
    }
}
