public class CircularPrimeNumber {

    public static boolean rotate(int num) //1193
    {
        int length = String.valueOf(num).length();//4
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int rem = num % 10; //3 // 9
            num /= 10; // 119 // 311 
            sum = rem * (int) Math.pow(10, length - 1) + num; 
            for (int j = 3; j * j <= sum; j++) {
                if (sum % j == 0)
                    return false;
            }
            num = sum;
            System.out.println(sum);
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1193;
        System.out.println("Given number is Circular Prime Number  : " + CircularPrimeNumber.rotate(num));

    }
}
