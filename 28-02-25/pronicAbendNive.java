import java.util.Scanner;

public class pronicAbendNive {

    private static boolean Abendent(int n) { 
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > n)
            return true;
        return false;
    }

    private static boolean Niven(int n) {
        int rem, temp = n, sum = 0;
        while (temp > 0) {
            rem = temp % 10; // 2
            sum += rem;
            temp /= 10;

        }
        // System.out.println(sum + " : ");
        if (n % sum == 0)
            return true;
        return false;
    }

    private static boolean pronic(int n) {
        for (int i = 1; i <= Math.floor(n / 2); i++) {
            if (i * (i + 1) == n)
                return true;
        }
        return false;
    }

    private static void CheckingAllNos(int n) {
        System.out
                .println(Abendent(n) && Niven(n) && pronic(n) ? "The given Number  statisfies Pronic Niven and Abendent"
                        : Abendent(n) && pronic(n) ? "The given number statisfies Abendent and pronic  "
                                : Niven(n) && pronic(n) ? "The given number statisfies Niven and pronic"
                                        : Abendent(n) && Niven(n) ? "The given number statisfies Abendent and Niven"
                                                : Abendent(n) ? "The given Numnber is Abendent"
                                                        : Niven(n) ? "the given Number is Niven"
                                                                : "The given Number is Pronic");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();
        pronicAbendNive.CheckingAllNos(n);

        input.close();

    }

}
