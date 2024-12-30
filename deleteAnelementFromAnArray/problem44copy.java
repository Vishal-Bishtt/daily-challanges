import java.util.Scanner;

public class problem44copy {
    public static void main(String[] args) {
        System.out.println("Delete a element from your array");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of your array : ");
        int length = input.nextInt();
        int[] array = new int[length];
        int i = 0;
        while (i<length){
            System.out.print("Enter your number "+(i+1)+": ");  //will push the number in your array
            int num2 = input.nextInt();
            array[i] = num2;
            i++;
        }System.out.print("Enter the number you want to delete : ");
        int num = input.nextInt();
        int count = length(array, num);
        int[] newar = update(array, count, num);
        int f = 0;
        while (f<newar.length){
            System.out.print(newar[i]+" ");
            f++;
        }
    }public static int length(int[] array, int num){ //count how many time the number is repeated
        int i=0;
        int count=0;
        while (i<array.length){
            if(array[i] == num){
                count++;
            }i++;
        }
        System.out.println(count);
        return count;
    }
    public static int[] update(int[] array, int count, int num){
        int actuallen = array.length;
        int[] newarray = new int[count];
        int i=0 , j = 0;
        while (i<array.length){
            if(array[i]!= num){
                newarray[j] = array[i];
                j++;
            }
            i++;
        }
    return newarray;
    }
}
