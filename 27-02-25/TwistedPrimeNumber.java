import java.util.Scanner;

public class TwistedPrimeNumber {

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

    public static void twistedprimeNum(int i) {
        if (IsPrime(i)) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum * 10 + rem;
                temp /= 10;
            }
            if (IsPrime(sum)) {
                System.out.println("This is Twisted Prime Number");
            }

        } else {
            System.out.println("This is not a prime Number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();
        TwistedPrimeNumber.twistedprimeNum(n);
        input.close();
    }
}
