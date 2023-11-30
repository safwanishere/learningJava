import java.util.Scanner;

public class MagicNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();

        int sumOfDigits = 0, dig, num = input;

        do {
            sumOfDigits = 0;
            for (int i = num; i>0; i/=10){
                dig = i%10;
                sumOfDigits += dig;
            }
            num = sumOfDigits;
        } while (sumOfDigits>=10);

        if (sumOfDigits == 1){
            System.out.println(input + " is a Magic Number");
        } else {
            System.out.println(input + " is not a Magic Number");
        }
    }
}
