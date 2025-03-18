public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // System.out.println(arr[j] + " : " + arr[j + 1]);
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}