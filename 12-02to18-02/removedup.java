public class removedup {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 5 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (arr[i] == arr[arr.length - 1])
                count++;
        }
        System.out.println(count);

        for (int val : arr)
            System.out.print(val + " ");
    }
}
