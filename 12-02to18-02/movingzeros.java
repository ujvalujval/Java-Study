public class movingzeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = i;
                count++;
                while (j < arr.length - count) {
                    arr[j] = arr[j + 1];
                    j++;
                }
                arr[j] = 0;
            }
        }
        for(int cha : arr)
            System.out.print(cha+" ");
    }
}
