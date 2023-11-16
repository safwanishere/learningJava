import java.util.Scanner;

public class ReverseInt {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int inputInt = scan.nextInt();

        int dig;
        System.out.print("The reverse is: ");

        while (inputInt>0){
            dig = inputInt%10;
            System.out.print(dig);
            inputInt /= 10;
        }
        scan.close();
    }
}