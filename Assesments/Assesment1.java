
public class Assesment1 {

    // Sorting the Matrix
    private static int[][] Sorting(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int x = i; x < arr[0].length; x++) {
                    for (int y = x == i ? (j + 1) : 0; y < arr[0].length; y++) {
                        if (arr[i][j] > arr[x][y]) {
                            arr[i][j] = arr[i][j] ^ arr[x][y];
                            arr[x][y] = arr[i][j] ^ arr[x][y];
                            arr[i][j] = arr[i][j] ^ arr[x][y];
                        }
                    }
                }
            }
        }
        return arr;
    }

    // Displaying the Matrix
    private static void Display(int[][] arr) {
        for (int[] val : arr) {
            for (int num : val) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Third Largest Number
    private static void ThirdLargestNum(int[][] arr) {
        Sorting(arr);
        System.out.println("Third Largest Number in Matrix is : " + arr[arr.length - 1][0]);
    }

    // Changing Values Except Diagonals
    private static int[][] ChangingVal(int[][] copyarr) {
        for (int i = 0; i < copyarr.length; i++) {
            for (int j = 0; j < copyarr[0].length; j++) {
                if (i != j) {
                    if (i < j)
                        copyarr[j][i] = copyarr[i][j];
                }
            }
        }
        // System.out.println(copyarr[2][1]);
        return copyarr;
    }

    // Abundent Number of Matrix
    private static String AbundantNumber(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int val = arr[i][j];
                int sum = 0;
                for (int k = 1; k <= val / 2; k++) {
                    if (val % k == 0)
                        sum += k;
                }
                if (sum > val)
                    count++;
            }
        }
        return (count % 2 == 0) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        int[][] arr = { { 5, 4, 7 }, { 1, 8, 3 }, { 9, 6, 2 } };

        int[][] copyarr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copyarr[i][j] = arr[i][j];
            }
        }

        // Program -1 Third Largest Number In Matrix
        Assesment1.ThirdLargestNum(arr);

        // Program -2 Sorting The Matrix
        Assesment1.Sorting(arr);
        // Displaying the Sorted Matrix
        System.out.println("The Sorted Matrix");
        Assesment1.Display(arr);

        // Program -3 Changing Value
        Assesment1.ChangingVal(copyarr);
        // Displaying The Changed Matrix
        System.out.println("The Rearranged Matrix except The diagonal");
        Assesment1.Display(copyarr);

        // Program -4 Abendent Matrix
        System.out.println("Is This The  Abundent Matrix : " + Assesment1.AbundantNumber(arr));

    }

}
