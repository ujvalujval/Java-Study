import java.util.Scanner;

public class inputstringarr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        input.nextLine();
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " index value : ");
            str[i] = input.nextLine();
        }
        System.out.println("Array values");
        for (String val : str) {
            System.out.print(val + " | ");
        }
        input.close();
    }
}