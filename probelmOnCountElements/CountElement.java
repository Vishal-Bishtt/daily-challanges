package probelmOnCountElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(3);
        i.add(8);
        i.add(3);
        i.add(5);
        i.add(4);
        int count1 = Collections.frequency(i,3);
        int count2 = Collections.frequency(i,5);
        int count3 = Collections.frequency(i,32);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

    }
}
