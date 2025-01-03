package problemOnFileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class writingReading {
    public static void main(String[] args) {
        System.out.println("File reader");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of your file: ");
        String name = input.nextLine();
        try(FileReader reader = new FileReader(name)){
            int read ;
            do{
                read = reader.read();
                System.out.print((char) read);
            }while(read != -1);
        }catch (IOException c){
            System.out.printf("%s is the error",c.getMessage());
        }
    }
}
