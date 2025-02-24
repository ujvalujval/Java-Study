// class Innerclassandobj {
//     int base;
//     int power;

//     int process() {
//         int result = 1;
//         for (int i = 0; i < power; i++) {
//             result *= base;
//         }

//         return result;
//     }

// }

import java.util.Scanner;

public class classandobj {
    String name;
    String regno;

    void display() {
        System.out.println("My name is " + name + " And my reg-no is " + regno);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        classandobj obj = new classandobj();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " name : ");
            obj.name = input.nextLine();
            System.out.print("Enter the " + (i + 1) + " reg-no : ");
            obj.regno = input.nextLine();
            obj.display();
        }

        input.close();
    }
}
