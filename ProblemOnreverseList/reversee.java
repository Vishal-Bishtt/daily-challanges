package ProblemOnreverseList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversee {
    public static void main(String[] args) {
        List<Integer> nn = new ArrayList<>();
        Collections.addAll(nn,34,34,65,657,2345,34,34545);
        for(int x:nn){
            System.out.print(x+" ");
        }
        System.out.println();
        Collections.reverse(nn);
        for(int x:nn){
            System.out.print(x+" ");
        }
    }
}
