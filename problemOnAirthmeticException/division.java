package problemOnAirthmeticException;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Division");
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        try{
            int result = first / second;
            System.out.println("Your result is: "+result);
        }catch (ArithmeticException exc){
            System.out.printf("%s Invalid values. ",exc.getMessage());
        }
    }
}
