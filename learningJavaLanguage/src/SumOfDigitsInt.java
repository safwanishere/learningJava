import java.util.Scanner;

public class SumOfDigitsInt{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int inputInt = scan.nextInt();

        int sum=0, dig;

        while (inputInt>0){
            dig = inputInt%10;
            sum += dig;
            inputInt /= 10;
        }
        scan.close();
        System.out.print("The sum of all digits is: "+sum);
    }
}