package problemOnString;

public class strrr {
    public static void main(String[] args) {
        System.out.println(concatenate("vishal"));
        System.out.println(concatenate("hello","world"));

    }public static String concatenate(String... sb){
        StringBuilder sbb = new StringBuilder();
        for(String nw: sb){
            sbb.append(nw).append(" ");
        }
        return sbb.toString();
    }
}
