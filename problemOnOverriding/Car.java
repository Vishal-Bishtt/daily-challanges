package problemOnOverriding;


public class Car extends Vehicle {
    public void service(){
        super.service();
        System.out.println("Car is ready for service......");
    }

    public static void main(String[] args) {
        System.out.println("Result");
        Car swift = new Car();
        swift.service();
    }
}
