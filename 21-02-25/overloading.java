
public class overloading {

    static class Inneroverloading {

        int area(int a) {
            return a * a;
        }

        int area(int l, int b) {
            return l * b;
        }

        float area(float r) {
            float pie = 3.14f;
            return pie * r * r;
        }
    }

    public static void main(String[] args) {
        Inneroverloading obj = new Inneroverloading();
        System.out.println("Area of Square : " + obj.area(10));
        System.out.println("Area of Rectangle : " + obj.area(10, 2));
        System.out.println("Area of Triangle : " + obj.area(10f));

    }

}

// tri = pir2
// rec = l * b
// sqa = a*a
