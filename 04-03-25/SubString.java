import java.util.Scanner;

public class SubString {

    private static void Substring1(String str, int start) {
        String substr1 = "";
        for (int i = start; i < str.length(); i++) {
            substr1 += str.charAt(i);
        }
        System.out.println("The Sub String Manual  : " + substr1);

        // BuildIn
        String substr11 = str.substring(4);
        System.out.println("The Sub string Buildin Method : " + substr11);

    }

    private static void Substring1(String str, int start, int end) {
        String substr2 = "";
        for (int i = start; i < str.length(); i++) {
            substr2 += str.charAt(i);
        }
        System.out.println("The Sub String Manual  : " + substr2);

        // BuildIn
        if (end < str.length()) {
            String substr22 = str.substring(4, 7);
            System.out.println("The Sub string Buildin Method : " + substr22);
        } else
            System.out.println("The given End is out of bound ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        Substring1(str, 4);
        System.out.println();
        Substring1(str, 4, 7);
        input.close();

    }

}
