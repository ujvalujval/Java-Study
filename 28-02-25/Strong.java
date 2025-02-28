
public class Strong {
    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    private static boolean strongNumber(int n) {
        int rem, temp, sum = 0;
        temp = n;
        while (temp > 0) {
            rem = temp % 10; // 5
            sum += factorial(rem);
            temp /= 10;
        }
        if (sum == n)
            return true;
        return false;
    }

    private static void rangeOF(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (strongNumber(i))
                System.out.println(i + " This is a Strong Number");
        }

    }

    public static void main(String[] args) {
        Strong.rangeOF(1, 1000);
    }

}
