import java.util.Scanner;

public class palindromeNumber {
    private static boolean PalindromeStr(int num) {
        if (num < 0)
            return false;
        int temp = num, reversestr = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reversestr = reversestr * 10 + rem;
            temp /= 10;
        }
        if (num == reversestr)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        System.out.println("The given is palindrome : "+palindromeNumber.PalindromeStr(num));
        palindromeNumber.PalindromeStr(num);
        input.close();

    }
}



