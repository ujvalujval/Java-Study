
import java.util.Scanner;

public class inputchararray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        char[] cher = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " index value : ");
            cher[i] = input.next().charAt(0);
        }
        System.out.println("Array values");
        for (char val : cher) {
            System.out.print(val + " ");
        }
        input.close();

    }
}
