public class Divide2Nos {
    public static void main(String[] args) {
        int divident = -2147483648, divisor = -1;
        if (divident == 0)
            System.out.println(0);
        else if (divisor == 0)
            System.out.println(-1);
        else {
            int result = 0;
            int max = (int) Math.pow(2, 31) - 1;
            int min = (int) -Math.pow(2, 31);
            System.out.println(max + " : " + min);
            int neg = (divident < 0) || (divisor < 0) ? -1 : 1;
            int a = Math.abs(divident);
            int b = Math.abs(divisor);
            if (a >= max) {
                System.out.println(neg * a - 1);
            } else {
                while (a >= b) {
                    int temp = b, mul = 1;
                    while (a >= temp << 1) {
                        temp <<= 1;
                        mul <<= 1;
                    }
                    a -= temp;
                    result += mul;
                }
                System.out.println(neg * result);
            }

        }

    }
}
