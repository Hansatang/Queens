import java.util.Arrays;

public class nQueens {
    private int x;

    private int[][] arr;

    public nQueens(int[][] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    public nQueens(int x) {
        this.x = x;
        arr = new int[x][x];
    }


    public boolean tryStep(int j) {

        if (j == x) {
            System.out.println("Complete");
            return true;
        }

        for (int i = 0; i < x; i++) {
            if (OK(i, j)) {
                System.out.println("\t Inserted");
                arr[i][j] = 1;
                printOut();
                if (tryStep(j + 1)) {
                    return true;
                }

                arr[i][j] = 0;
            }

        }

        return false;
    }


    public boolean OK(int xx, int y) {
        for (int i = 0; i < x; i++) {
            try {
                if (arr[xx - i][y - i] != 0) {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }
            try {
                if (arr[xx + i][y - i] != 0) {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }
            if (arr[xx][i] != 0) {
                return false;
            }
            if (arr[i][y] != 0) {

                return false;
            }
        }
        return true;
    }

    public void printOut() {
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));
    }
}
