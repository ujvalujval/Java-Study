public class sumoddigits {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6,10,7,4,7,80 };
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        System.out.println("Sum : " + sum);
        int sumofdig = 0;
        while (sum > 0) {
            int rem = sum % 10;
            sumofdig += rem;
            sum /= 10;

        }
        System.out.println(sumofdig);
    }
}
