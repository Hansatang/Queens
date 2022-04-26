import java.util.Arrays;

public class QueensNew {
    private int x;

    private int[][] arr;

    public QueensNew(int[][] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    public QueensNew(int x) {
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
            System.out.println("A " + (xx + i));
            System.out.println("B " + (y - i));
            try {
                if (arr[xx - i][y - i] != 0) {
                    System.out.println("1 check");
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                if (arr[xx + i][y - i] != 0) {
                    System.out.println("2 check");
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            if (arr[xx][i] != 0) {
                System.out.println("3 check");
                return false;
            }
            if (arr[i][y] != 0) {
                System.out.println("4 check");
                return false;
            }
        }
        return true;
    }

    public void printOut() {
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));
    }
}
