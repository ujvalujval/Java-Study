
public class valoccurences {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 1, 1, 34, 5, 34 };
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (newarr[i] == 1)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    newarr[j] = 1;
                }
            }
            System.out.println(arr[i] + " :" + count);
        }
    }
}
