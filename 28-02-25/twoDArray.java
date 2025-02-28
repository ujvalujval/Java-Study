import java.util.Scanner;

public class twoDArray {

    private static int[][] sorting(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                for (int x = i; x < twoDArray[0].length; x++) {
                    for (int y = x == i ? (j + 1) : 0; y < twoDArray[0].length; y++) {
                        if (twoDArray[i][j] > twoDArray[x][y]) {
                            twoDArray[i][j] = twoDArray[i][j] ^ twoDArray[x][y];
                            twoDArray[x][y] = twoDArray[i][j] ^ twoDArray[x][y];
                            twoDArray[i][j] = twoDArray[i][j] ^ twoDArray[x][y];
                        }
                    }
                }
            }
        }
        return twoDArray;

    }

    private static int[][] daigonalSum(int[][] twoDArray) {
        int topadd = 0;
        int bottomadd = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                if (i != j) {
                    if (i < j) {
                        topadd += twoDArray[i][j];
                    } else {
                        bottomadd += twoDArray[i][j];
                    }

                }
            }
        }
        twoDArray[0][0] = topadd;
        twoDArray[twoDArray.length - 1][twoDArray.length - 1] = bottomadd;
        return twoDArray;

    }

    private static int[][] diagonalreverse(int[][] twoDArray) {
        int row = twoDArray.length;
        for (int i = 0; i < Math.floor(row / 2); i++) {
            twoDArray[i][i] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];
            twoDArray[row - i - 1][row - i - 1] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];
            twoDArray[i][i] = twoDArray[i][i] ^ twoDArray[row - i - 1][row - i - 1];

        }
        return twoDArray;
    }

    private static int[][] TransposeMatrix(int[][] twoDArray) {
        int[][] transpose = new int[twoDArray[0].length][twoDArray.length];
        for (int i = 0; i < twoDArray[0].length; i++) {
            for (int j = 0; j < twoDArray.length; j++) {
                transpose[i][j] = twoDArray[j][i];
            }
        }
        return transpose;
    }

    private static void DisplaytwoD(int[][] arras) {
        for (int[] val : arras) {
            for (int num : val) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Two D Array");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int row = input.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int col = input.nextInt();
        int[][] arras = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the " + (i + 1) + " row ");
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the " + (j + 1) + " col : ");
                arras[i][j] = input.nextInt();
            }
        }
        twoDArray.DisplaytwoD(arras);
        System.out.println();
        // twoDArray.sorting(arras);
        // twoDArray.daigonalSum(arras);
        // twoDArray.diagonalreverse(arras);
        // twoDArray.DisplaytwoD(arras);
        twoDArray.TransposeMatrix(arras);
        System.out.println();
        // twoDArray.DisplaytwoD(arras);
        input.close();

    }

}
