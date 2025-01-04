package SwapIntegers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class intswap {
    public static void main(String[] args) {
        List<Integer> swa = new ArrayList<>();
        Collections.addAll(swa,3,4,5,6,3,4,6,7,8);
        for(int x : swa ){
            System.out.print(x);
        }
        System.out.println();
        int a = swa.remove(2);
        swa.add(2,0);
        int b = swa.remove(4);
        swa.add(4,0);

        System.out.println(b);
        swa.remove(4);
        swa.add(4,a);
        swa.remove(2);
        swa.add(2,b);
        for(int x : swa ){
            System.out.print(x);
        }
    }
}
