import java.util.ArrayList;
import java.util.HashMap;

public class Utopia {
    static HashMap<Integer, Integer> minimumCoinAmount = new HashMap<>();

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
            if (minimumCoinAmount.get(length % 22) == null) {
                value = getMinimum(length % 22);
                minimumCoinAmount.put(length % 22, value);
            } else {
                value = minimumCoinAmount.get(length % 22);
            }
            q = q + value;
            list.add(q);
        }
        if (length > 10) {
            System.out.println("Above 10");
            int w = length / 10;
            if (minimumCoinAmount.get(length % 10) == null) {
                value = getMinimum(length % 10);
                minimumCoinAmount.put(length % 10, value);
            } else {
                value = minimumCoinAmount.get(length % 10);
            }
            w = w + value;
            list.add(w);
        }
        if (length > 7) {
            System.out.println("Above 7");
            int e = length / 7;
            if (minimumCoinAmount.get(length % 7) == null) {
                value = getMinimum(length % 7);
                minimumCoinAmount.put(length % 7, value);
            } else {
                value = minimumCoinAmount.get(length % 7);
            }
            e = e + value;
            list.add(e);
        }
        if (length > 1) {
            System.out.println("Above 1");
            int r = length;
            list.add(r);
        }
        return getMin(list);
    }

    public int getMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }
}
