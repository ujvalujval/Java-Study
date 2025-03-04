import java.util.Scanner;

public class Palindrome {

    private static void Reverse(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        // System.out.println(reverseStr);
        if (str.equals(reverseStr.toString()))
            System.out.println("This is Palindrome");
        else
            System.out.println("This is not palindrome");
    }

    private static void Reversemanual(String str) {
        String manual = new StringBuilder(str).reverse().toString();
        if (manual.equals(str))
            System.out.println("The given string is  Palindrome");
        else
            System.out.println(str + "The given string is not  Palindrome");

    }

    private static void ReverseMethod2(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        // System.out.println(buffer);

        if (str.equals(buffer.toString()))
            System.out.println("The given string is a palindrome.");
        else
            System.out.println("The given string is not a palindrome.");
        String substr = buffer.substring(4);
        System.out.println("Sub String : " + substr);
    }

    private static void ReverseMethod3(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        // System.out.println(builder);

        if (str.equals(builder.toString()))
            System.out.println("The given string is a palindrome.");
        else
            System.out.println("The given string is not a palindrome.");
        String substr = builder.substring(0, 5);
        System.out.println("Sub String : "+substr);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.nextLine();

        Palindrome.Reverse(str);
        Palindrome.Reversemanual(str);
        Palindrome.ReverseMethod2(str);
        Palindrome.ReverseMethod3(str);

        input.close();
    }
}