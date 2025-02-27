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
        int firstNumber = -1, secondNumber = 1, result;
        for (int i = 0; i < n; i++) {
            result = firstNumber + secondNumber;
            // System.out.println( firstNumber+" : "+secondNumber);
            System.out.print(" " + result);
            firstNumber = secondNumber;
            secondNumber = result;
        }
    }

    public static void main(String[] args) {
        Examples.factorial(5);
        Examples.primeNUmber(2, 10);
        Examples.fibonnicSeries(5);

    }
}
