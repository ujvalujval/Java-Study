
public class amstrongnum {
    public static void display(int num) {
        int temp = num;
        String b = String.valueOf(temp);
        int len = b.length();
        int sum = 0;
        while (temp > 0) {
            int rem = 0;
            rem = temp % 10;
            sum += Math.pow(rem, len);
            temp /= 10;
        }
        if (sum == num)
            System.out.println("It is an Amstrong Number");
        else
            System.out.println("Not an Amstrong Number");
    }

    public static void main(String[] args) {
        int num = 1634;
        display(num);
    }
}
