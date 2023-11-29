import java.util.Scanner;
import java.lang.Math;

public class CapricornNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int squareOfNum = num*num, count = 0;
        boolean check = true;

        for (int i = squareOfNum; i>0; i/=10){
            count += 1;
        }

        for (int i = 1; i<count; i++){
            int divisor = (int) Math.pow(10, i);
            int firstPart = squareOfNum / divisor;
            int secondPart = squareOfNum % divisor;

            if ( firstPart + secondPart == num){
                System.out.println(num + " is a Capricorn/Kaprekar number");
                check = true;
                break;
            }
            else {
                check = false;
            }
        }

        if (!check){
            System.out.println(num + " is not a Capricorn/Kaprekar number");
        }
    }
}