public class StringRepeatNos {

    // private static boolean isDigit(char ch) {
    // if (ch <= '0' && ch >= '9')
    // return true;
    // return false;
    // }

    // private static boolean isletter(char ch) {
    // if (ch <= 'a' && ch >= 'z')
    // return true;
    // return false;
    // }

    private static void display(String str) {
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int isvalue = 1;
                if (i + 1 < n && Character.isDigit(str.charAt(i + 1))) {
                    isvalue = str.charAt(i + 1) - '0';
                    i++;
                }
                for (int j = 1; j <= isvalue; j++)
                    result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "a3bd2c";
        display(str);
    }
}
