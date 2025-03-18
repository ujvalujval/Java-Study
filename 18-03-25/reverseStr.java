public class reverseStr {
    public static void main(String[] args) {
        String str = "Ujval";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String rev = "";
        for (char val : arr)
            rev += val;
        System.out.println(rev);
    }
}
