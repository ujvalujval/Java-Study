
public class HarshadNos {

    private static boolean checkingNos(int i) {
        int rem, sum = 1, temp = i;
        while (temp > 0) {
            rem = temp % 10; // 2
            sum += rem;
            temp /= 10;
        }
        sum -= 1;
        if (i % sum == 0)
            return true;
        return false;
    }

    private static void harshathnos(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (checkingNos(i)) {
                count++;
                System.out.println(i + " This is a Harshad Number");
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        HarshadNos.harshathnos(500, 2500);
    }
}