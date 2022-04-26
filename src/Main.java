public class Main {

    public static void main(String[] args) {
        Queens queens = new Queens();

       queens.create(4);
        queens.add(1);
        queens.add(7);
        queens.add(8);
        if (queens.OK(3)){
            System.out.println("nice");
        }
        else {
            System.out.println("Not nice");
        }
    }
}
