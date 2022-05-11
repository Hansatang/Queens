public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        nQueens queensNew = new nQueens(arr, 4);
        queensNew.tryStep(0);
        queensNew.printOut();


        Utopia utopia = new Utopia();
        System.out.println(utopia.getMinimum(15));
    }
}
