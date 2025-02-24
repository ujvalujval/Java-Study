public class rotted {
    public static void main(String[] args) {
        int[] arr = { 10,5 };
        int rotate = 3;
        for (int i = 0; i < rotate % arr.length; i++) {
            int currvalue = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = currvalue;
        }
    }
}
