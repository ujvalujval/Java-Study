public class AutoMorphic {
    private static boolean ISAutoMorphic(int n) {
        int result = n * n;
        int length = String.valueOf(n).length();
        int check = result % (int) Math.pow(10, length);
        if (check == n)
            return true;
        else
            return false;
    }

    public static void VerifyNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (ISAutoMorphic(i)) {
                System.out.println(i + " is a AutoMarphic Number");
            }
        }

    }

    public static void main(String[] args) {
        AutoMorphic.VerifyNumber(0, 10);

    }
}

// Checking the given Number is AutoMorphic or not

// Scanner input = new Scanner(System.in);
// System.out.print("Enter a Number : ");
// int n = input.nextInt();
// int result = n * n;
// System.out.println("Square value : " + result); // 625 10 * 10 => 100.length
// int length = String.valueOf(n).length(); // n - 2;
// int check = result % (int) Math.pow(10, length); // 10 2 //25
// if (check == n) { //
// System.out.println(n + " is an Automorphic Number.");
// } else {
// System.out.println(n + " is not an Automorphic Number.");
// }
// input.close();
