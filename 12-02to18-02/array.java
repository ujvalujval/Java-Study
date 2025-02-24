// import java.util.Arrays;

public class array {
    public static void display(String str) {
        // System.out.println(Astrys.toString(arr));
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        System.out.println(sum);

    }

    public static void main(String args[]) {
        String str = "123456";
        display(str);
    }
}
