package problemOnOverloading;


public class testcode {
    public static void main(String[] args) {
        System.out.println("Addition by overloading");
        calculator add = new calculator();
        // testing two integer sum
        System.out.println(add.sum(33,45));
        // testing two double sum
        System.out.println(add.sum(444.5,3456.56));
        // testing three integer sum
        System.out.println(add.sum(33,44,554));
    }
}
