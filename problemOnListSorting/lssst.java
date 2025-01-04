package problemOnListSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lssst {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Vishal");
        l.add("Helllo");
        l.add("Hey");
        l.add("vishal");
        Collections.sort(l);
        for(String ep : l){
            System.out.println(ep);
        }
    }
}
