package problemOnString;

import java.lang.String;

public class Test
{

    public static void main(java.lang.String[] args)
    {
        concatenate("vishal");
        System.out.println(concatenate("vishal"));
        System.out.println(concatenate("hello", "world"));
    }
    public static java.lang.String concatenate(java.lang.String... sb)
    {
        StringBuilder sbb = new StringBuilder();
        for (String nw : sb)
        {
            sbb.append(nw).append(" ");
        }
        return sbb.toString().trim();
    }

}