import java.util.*;

public class Main {
    static public void main(String[] arg) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList_2 = new ArrayList();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                intList_2.add(intList.get(i));
            }
        }
        List<Integer> intList_3 = new ArrayList();
        for (int i = 0; i < intList_2.size(); i++) {
            if (intList_2.get(i) % 2 == 0) {
                intList_3.add(intList_2.get(i));
            }
        }
        Collections.sort(intList_3, (o1, o2) -> o1.compareTo(o2));
        System.out.println(intList_3);
    }
}
