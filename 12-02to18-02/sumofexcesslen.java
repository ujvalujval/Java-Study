public class sumofexcesslen {

    public static void main(String[] args) {
        String num1 = "7";
        String num2 = "13";
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int dig1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int dig2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = dig1 + dig2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
            i--;
            j--;

        }

        System.out.println("sum : " + result.reverse().toString());

    }
}