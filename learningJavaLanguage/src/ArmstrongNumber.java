import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        scan.close();

        int dig, sumOfCubeOfDigits = 0;

        for (int i = num; i > 0; i/=10){
            dig = i%10;
            sumOfCubeOfDigits += dig*dig*dig;
        }

        if (sumOfCubeOfDigits == num){
            System.out.print(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
