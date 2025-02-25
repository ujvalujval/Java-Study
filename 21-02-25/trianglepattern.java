public class trianglepattern {
    static int n = 5;

    static class Inner {
        void display() {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    if (col % 2 != 0)
                        System.out.print("* ");
                    else
                        System.out.print("# ");
                }
                System.out.println("  ");
            }
        }
    }

    public static void main(String[] args) {
        Inner obj = new Inner();
        obj.display();

    }
}