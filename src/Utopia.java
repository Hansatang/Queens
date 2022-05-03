import java.util.ArrayList;
import java.util.HashMap;

public class Utopia {
    static HashMap<Integer, Integer> bestRodValue = new HashMap<>();

    static int arr[] = {1, 7, 10, 22};

    public int getMinimum(int length) {
        ArrayList<Integer> list = new ArrayList();


        for (int i = 0; i < arr.length; i++) {
            if (length == arr[0]) {
                return 1;
            }
        }
        int value;
        if (length > 22) {
            int q = length / 22;
            if (bestRodValue.get(length % 22) == null) {
                value = getMinimum(length % 22);
                bestRodValue.put(length % 22, value);
            } else {
                value = bestRodValue.get(length % 22);
            }
            q = q + value;
            list.add(q);
        }
        if (length > 10) {
            System.out.println("Above 10");
            int w = length / 10;
            w = w + getMinimum(length % 10);
            System.out.println("W " + w);
            list.add(w);
        }
        if (length > 7) {
            int e = length / 7;
            System.out.println("Above 7");
            e = e + getMinimum(length % 7);
            System.out.println("E " + e);
            list.add(e);
        }
        if (length > 1) {
            System.out.println("Above 1");
            int r = length;
            System.out.println("R " + r);
            list.add(r);
        }
        return getMax(list);
    }

    public int getMax(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}
