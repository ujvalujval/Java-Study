public class MissingElement {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}