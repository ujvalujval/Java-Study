import java.util.Scanner;

public class conceptarr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the index " + i + " value :");
            arr[i] = input.nextInt();
        }
        for (int cha : arr) {
            if (cha == 3)
                cha = 6;

            System.out.print(cha + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
