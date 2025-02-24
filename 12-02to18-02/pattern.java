import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = input.nextInt();
        // ------------------------------------------------------
        // for(int i = 1;i<=n;i++){
        // for(int j = 1;j<=i;j++){
        // System.out.print(1+" ");
        // }
        // System.out.println();
        // }
        // ---------------------------------------------------------
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // input.close();

        // ----------------------------------------------------------------
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // input.close();
        // ------------------------------------------------------------------------
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // System.out.print("1");

        // }
        // System.out.println();
        // }
        // --------------------------------------------------------------------------------

        // int count = 1;
        // for(int i = 0;i<=n;i++){
        // for(int j =1;j<=i;j++){
        // System.out.print(count+" ");
        // count++;
        // }
        // System.out.println();
        // }
        // ------------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++)
        // System.out.print(" ");
        // for (int k = 1; k <= i * 2 - 1; k++)
        // System.out.print("1");
        // System.out.println();
        // }
        // ---------------------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++)
        // System.out.print(" ");
        // for (int k = 1; k <= i * 2 - 1; k++) {
        // if (i == n || k == i * 2 - 1 || k == 1) {
        // System.out.print("1");
        // } else
        // System.out.print("o");
        // }
        // // System.out.print("1");
        // System.out.println();
        // }
        // --------------------------------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++)
        // System.out.print(" ");
        // for (int k = 1; k <= i * 2 - 1; k++) {
        // if (k == i * 2 - 1 || k == 1) {
        // System.out.print("1");
        // } else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // --------------------------------------------------------------------------------
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }
        // ----------------------------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i > 0; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }
        // ------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // if (k == 1 || k == i)
        // System.out.print("x ");
        // else
        // System.out.print("o ");

        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i > 0; i--) {
        // for (int j = 1; j <= n - i; j++) { 
        // System.out.print(" ");
        // }
        // for (int k = n - i; k < n; k++) {
        // if (k == 1 || k == i)
        // System.out.print("x ");
        // else
        // System.out.print("o ");

        // }
        // System.out.println();
        // }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == i * 2 - 1 || k == 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == i * 2 - 1 || k == 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
        input.close();   
    }
}
