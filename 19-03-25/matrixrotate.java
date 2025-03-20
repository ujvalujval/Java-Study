
public class matrixrotate {

    private static int[][] rotatematrix(int[][] matrix) {
        System.out.println("90 degree clockwise diraction");
        int rotatematrix[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                rotatematrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < rotatematrix.length; i++) {
            for (int j = rotatematrix.length - 1; j >= 0; j--) {
                System.out.print(rotatematrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        return rotatematrix;

    }

    private static int[][] clockwiserotate(int[][] rotatematrix) {
        System.out.println("90 degree counterclockwise direction");
        int clockwise[][] = new int[rotatematrix.length][rotatematrix.length];

        for (int i = rotatematrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < rotatematrix.length; j++) {
                // System.out.println(j+" : "+i);
                clockwise[i][j] = rotatematrix[j][i];
            }

        }
        for (int[] num : clockwise) {
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        return rotatematrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                // { 1, 2, 3, 11 },
                // { 4, 5, 6, 12 },
                // { 7, 8, 9, 13 },
                // { 10, 14, 15, 16 },

                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println("Original Matrix");
        for (int[] num : matrix) {
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
        matrixrotate.clockwiserotate(rotatematrix(matrix));

    }
}
