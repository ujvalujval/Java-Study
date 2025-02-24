public class addtoarray {
    public static void main(String[] args) {
        int[] arr1 = { 5, 1, 3 };
        int[] arr2 = { 9, 7, 7, 7 };
        int maxlen = arr1.length > arr2.length ? arr1.length : arr2.length;
        int minlen = arr1.length > arr2.length ? arr2.length : arr1.length;
        int[] addarr = new int[maxlen];
        int carry = 0;
        for (int i = 0; i < minlen; i++) {
            int add = arr1[i] + arr2[i] + carry; // 590 //14
            if (add > 9) {
                addarr[i] = add % 10;
                carry = 1;
            } else {
                addarr[i] = add;
                carry = 0;
            }
            if (i == minlen-1 && i < maxlen) {
                addarr[i] = arr2[i] + carry;
                System.out.println(addarr[i]);

            }
        }

        for (int val : addarr)
            System.out.print(val + " ");
    }
}
