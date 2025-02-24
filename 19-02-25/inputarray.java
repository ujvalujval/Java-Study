import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " index value : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Array values");
        for(int val : arr){
            System.out.print(val+" ");
        }

        input.close();
    }
}
