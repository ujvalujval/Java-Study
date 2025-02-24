public class reverseofn {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 2;
        if (arr.length < n) {
            for (int val : arr)
                System.out.print(val);

        } else {
            for (int i = 0; i < arr.length / n; i++) {
                int limit = i * n + n - 1;
                for (int j = i * n; j < limit; j++) {
                    int temp = arr[limit];
                    arr[limit] = arr[j];
                    arr[j] = temp;

                }
            }
            for (int val : arr)
                System.out.print(val);
        }

    }
}