public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
//        arr[1][0] = 1;
//        arr[3][1] = 1;
//        arr[0][2] = 1;

//        arr[2][3] = 1;

//        arr[2][0] = 1;
//        arr[0][1] = 1;
//        arr[3][2] = 1;
        QueensNew queensNew = new QueensNew(arr, 4);
        queensNew.tryStep(0);
        queensNew.printOut();
    }
}
