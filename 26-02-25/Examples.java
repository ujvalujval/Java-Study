public class Examples {

    public static void factorial(int n) {
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        System.out.println("Factorial : " + sum);
    }

    public static void primeNUmber(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime Number");
            }
        }

    }

    private static boolean isPrime(int check) {
        if (check < 2)
            return false;
        if (check == 2)
            return false;
        if (check % 2 == 0)
            return false;

        for (int j = 3; j * j <= check; j += 2) {
            if (check % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fibonnicSeries(int n) {
        System.out.println("Fibonnic Series : ");
        int a = -1, b = 1, c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            // System.out.println( a+" : "+b);
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Examples.factorial(5);
        Examples.primeNUmber(2, 10);
        Examples.fibonnicSeries(5);

    }
}
