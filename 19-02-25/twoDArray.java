import java.util.Scanner;

public class twoDArray {
    static Scanner input = new Scanner(System.in);

    public static int[][] sorting(int[][] twodarray) {
        for (int i = 0; i < twodarray.length; i++) {
            for (int j = 0; j < twodarray.length; j++) {
                for (int x = i; x < twodarray[i].length; x++) {
                    for (int y = x == i ? j + 1 : 0; y < twodarray[j].length; y++) {
                        if (twodarray[i][j] > twodarray[x][y]) {
                            twodarray[i][j] = twodarray[i][j] ^ twodarray[x][y];
                            twodarray[x][y] = twodarray[i][j] ^ twodarray[x][y];
                            twodarray[i][j] = twodarray[i][j] ^ twodarray[x][y];
                        }
                    }
                }
            }
        }
        return twodarray;
    }

    public static int[][] transpose(int[][] twodArray) {
        int[][] transpose = new int[twodArray[0].length][twodArray.length];
        for (int i = 0; i < twodArray[0].length; i++) {
            for (int j = 0; j < twodArray.length; j++) {
                transpose[i][j] = twodArray[j][i];
            }
        }
        for (int[] val : transpose) {
            for (int num : val) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return transpose;
    }

    public static int[][] addexceptdiagonals(int[][] twoDArray) {
        int row = twoDArray.length;
        int col = twoDArray[0].length;
        int topval = 0;
        int bottomval = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j) {
                    if (i < j)
                        topval += twoDArray[i][j];
                    else
                        bottomval += twoDArray[i][j];
                }
            }
        }
        twoDArray[0][0] = topval;
        twoDArray[row - 1][col - 1] = bottomval;

        return twoDArray;
    }

    public static int[][] exchangediagonals(int[][] twoDArray) {
        int row = twoDArray.length;
        for (int i = 0; i < Math.floor(row / 2); i++) {
            twoDArray[i][i] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];
            twoDArray[row - i - 1][row - i - 1] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];
            twoDArray[i][i] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];
        }
        return twoDArray;
    }

    public static void main(String[] args) {
        System.out.print("\nEnter the size of the row :");
        int row = input.nextInt();
        System.out.print("\nEnter the size 0f the coloumn :");
        int col = input.nextInt();
        int[][] twodarray = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.print("\n ENter " + (i + 1) + "row values : ");
            for (int j = 0; j < col; j++) {
                twodarray[i][j] = input.nextInt();
            }
        }
        System.out.println(" Your matrix value is\n");
        // sorting matrix
        // sorting(twodarray);
        // transpose(twodarray);
        // addexceptdiagonals(twodarray);
        exchangediagonals(twodarray);
        for (int[] val : twodarray) {
            for (int num : val) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
