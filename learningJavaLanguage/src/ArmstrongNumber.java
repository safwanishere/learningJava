import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        scan.close();

        int sumOfPowerOfDigits = 0, dig, count = 0;

        for (int i = num; i>0; i/=10){
            count += 1;
        }

        for (int i = num; i > 0; i/=10){
            dig = i%10;
            sumOfPowerOfDigits += Math.pow(dig, count);
        }

        if (sumOfPowerOfDigits == num){
            System.out.print(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}