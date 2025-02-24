public class findmaxinnarr {

    public static void sortarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        for (int cha : arr)
            System.out.print(cha + " ");
    }

    public static void FirstMaxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("FirstMaxValue : " + max);

    }
    public static void SecMaxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("SecMaxValue : " + max);

    }
    public static void ThirMaxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length-2; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("ThirMaxValue : " + max);

    }
    
    public static void main(String[] args) {
        int[] arr = { 10, 30, 4, 6, 1, 100 };
        sortarr(arr);
        System.out.println();
        FirstMaxNum(arr);
        SecMaxNum(arr);
        ThirMaxNum(arr);
    }
}
