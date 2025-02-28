import java.util.ArrayList;

public class TwistedCircular {

    // To check prime Number or not
    private static boolean IsPrime(int n) {
        int temp = n;
        if (temp < 2)
            return false;
        else if (temp % 2 == 0)
            return false;
        else {
            for (int j = 3; j * j <= temp; j++) {
                if (temp % j == 0)
                    return false;
            }
        }
        return true;
    }

    // Twisted Prime Number
    public static boolean twistedprimeNum(int i) {
        if (IsPrime(i)) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum * 10 + rem;
                temp /= 10;
            }
            if (IsPrime(sum)) {
                return true;
            }
        }
        return false;
    }

    // Circular checking
    public static boolean rotate(int num) {
        int length = String.valueOf(num).length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int rem = num % 10; // 1234 // 4
            num /= 10; // 123
            sum = rem * (int) Math.pow(10, length - 1) + num; //4123
            for (int j = 3; j * j <= sum; j++) {
                if (sum % j == 0)
                    return false;
            }
            num = sum;
            System.out.println(sum);
        }
        return true;
    }

    // Checking Twisted Circular Prime Number or Not
    public static ArrayList<Integer> checking(int start, int end) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int k = start; k <= end; k++) {
            if (twistedprimeNum(k) && rotate(k) && IsPrime(k)) {
                result.add(k);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> twistedCircularNumbers = checking(1, 1000);
        System.out.println("Twisted Circular Prime Numbers: " + twistedCircularNumbers);
    }

}

// public static void chcecking(int start, int end) {
// for (int k = start; k <= end; k++) {
// if (IsPrime(k)) {
// if (twistedprimeNum(k)) {
// if (rotate(k)) {
// System.out.println("This is a Twisted Circular Number : " + k);
// }
// }
// }

// }
// }

// public static void main(String[] args) {
// TwistedCircular.chcecking(1, 1000);

// }
