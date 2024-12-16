import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        System.out.println("PELEDROME NUMBER");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=input.nextInt();
        boolean numCheck=numcheck(num);
        if(numCheck){
            System.out.println("It is a peledrome number ");
        }else{
            System.out.println("It is not an peledrome number");
        }
    }public static boolean numcheck(int num){
        int copynum=num;
        //System.out.println("copy "+copynum);
        int i=0;
        int reverse=0;
        while(i<num){
            reverse+=num%10;
            reverse*=10;
            num/=10;
        }int Freverse=reverse/10;
        //System.out.println("Reverse"+Freverse);
        return copynum==Freverse;


    }
}