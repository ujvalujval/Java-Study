
public class sum {

    public static void addingevenodd(int num) {
        int evensum = 0;
        int oddsum = 0;
        int primesum = 0;
        // int countprime = 0; 
        while (num > 0) {
            int rem = 0;
            rem = num % 10;
            if (rem % 2 == 0)
                evensum = evensum * 10 + rem;
            else
                oddsum = oddsum * 10 + rem;
            int count = 0;
            for (int i = 2; i < rem; i++) {
                if (rem % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                primesum = primesum * 10 + rem;
                // countprime++;
                count = 0;
            }
            num /= 10;
        } 
        // int sum = 0;
        // while (primesum > 0) {
        //     int rem = 0;
        //     rem = primesum % 10; // 1
        //     for (int i = rem; i < countprime; i++) { // 1
                
        //     }

        // }

        System.out.println("sum of even :" + evensum + " || sum of odd : " + oddsum + " primeNumber : " + primesum);
    }

    public static void main(String[] args) {
        int num = 123456;
        addingevenodd(num);
    }
}
