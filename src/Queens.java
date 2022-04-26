import java.util.ArrayList;
import java.util.List;

public class Queens {

    private List<Integer> results = new ArrayList();
    private int size;





    public void create(int size) {
        this.size = size;

      //  tryStep(0);
    }

    public void add(int number) {
        results.add(number);
    }

    public void tryStep(int position) {
        {
            if (results.size() == size) {
                System.out.println("Complete");
            } else {
                for (int i = 0; i < size; i++) {
                    if (OK(i)) {
//                        results.set(position, i+1);
//                        //tryStep(next(step));
//                        results.set(position, 0+1);
                    }
                }
            }
        }
    }

    public boolean OK(int iterations) {
        if (iterations == 1) {
            return true;
        } else {
            for (int i = 1; i < iterations; i++) {
                System.out.println("I "+i);
                for (int j = 0; j < i ; j++) {

                    System.out.println("J "+j);
                    System.out.println("I value "+results.get(i) );
                    System.out.println("J value "+results.get(j) );
                    System.out.println("Size "+size);

                    if (((results.get(i) - results.get(j)) /size) == 0 && (results.get(i) - results.get(j)>4)) {
                        System.out.println("vertical");
                        return false;
                    }
                    if (((results.get(i) - results.get(j)) / (size-1)) ==0 && (results.get(i) - results.get(j)>4)) {
                        System.out.println("up");
                        return false;
                    }
                    if (((results.get(i) - results.get(j)) / (size+1))==0 && (results.get(i) - results.get(j)>4)) {
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
