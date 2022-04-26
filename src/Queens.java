import java.util.ArrayList;
import java.util.List;

public class Queens {

    private List<Integer> results = new ArrayList();
    private int size;


    public Queens(int size, int startposition) {
        this.size = size;
        results.add(startposition);
    }

    public void add(int number) {
        results.add(number);
    }

    public void tryStep(int position) {
        {
            if (position == size) {
                System.out.println("Complete");
            } else {
                for (int i = 1; i < size; i++) {
                    for (int j = 1; j < size*size ; j++) {
                        if (OK2(i + 1, j)) {
                            System.out.println("Hey " + j);
                            results.add(position, j);
                            tryStep(position++);
                        }

                    }
                }

            }
        }
    }

    public boolean OK(int iterations, int number) {
        System.out.println("Iterations " + iterations);
        System.out.println("Number " + number);
        if (iterations == 1) {
            return true;
        } else if (number <= size) {
            return false;
        } else {
            for (int i = 1; i < iterations; i++) {
                System.out.println("I " + i);
                for (int j = 0; j < i; j++) {
                    System.out.println("J " + j);
                    System.out.println("J value " + results.get(j));
                    int minus = number - results.get(j);
                    System.out.println(minus);
                    System.out.println("1 check "+(minus / (size)));
                    if ((minus / size) == 0 || (minus % size) == 0) {
                        System.out.println("Vertical check");
                        if ((number - results.get(j) < 4)) {

                        } else {
                            System.out.println("vertical");
                            return false;
                        }
                    }
                    System.out.println("2 check "+(minus % (size - 1)));
                    if ((minus / (size - 1)) == 0 ) {
//                        if ((number - results.get(j) < 4)) {
//
//                        } else {
                            System.out.println("up");
                            return false;
                        //}

                    }
                    System.out.println("3 check "+(minus / (size + 1)));
                    if ((minus / (size + 1)) == 0) {
//                        if ((number - results.get(j) < 4)) {
//
//                        } else {
                            System.out.println("down");
                            return false;
                       // }
                    }
                    System.out.println("Bad");
                }
            }
        }
        return true;
    }


    public void printList() {
        for (Integer result : results) {
            System.out.println(result);
        }
    }

    public boolean OK2(int iterations, int number) {
        if (iterations == 1) {
            return true;
        } else if (number <= size) {
            return false;
        } else {

            for (int i = 1; i < iterations; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.println("Number " + number);
                    System.out.println("j " + results.get(j));
                    int minus = number - results.get(j);
                    System.out.println(minus);
                    if ((minus / size) == 0 || (minus % size) == 0) {
                            System.out.println("vertical");
                            return false;
                    }
                    if ((minus / size+1) == 0){
                        System.out.println("up");
                        return false;
                    }
                    if ((minus / size-1) == 0){
                        System.out.println("down");
                        return false;
                    }


                    System.out.println("Bad");
                }

            }
        }
        return true;
    }

}
