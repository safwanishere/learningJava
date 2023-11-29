import java.util.Scanner;
import java.lang.Math;

public class CircularPrime {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = scan.nextInt();
        scan.close();

        int count = 0, rem, num = input;
        boolean check = true;

        for (int i = num; i>0; i/=10){ count++; }
        for (int i = 1; i<=count; i++){
            rem = num % 10;
            num /= 10;
            num = (rem * (int) Math.pow(10, count-1)) + num;

            if (!checkPrime(num)){
                check = false;
                break;
            }
        }

        if (check){
            System.out.println(input + " is a Circular Prime");
        } else {
            System.out.println(input + " is not a Circular Prime");
        }
    }

    public static boolean checkPrime(int n){
        boolean bool = false;
        for (int i = 2; i<n; i++){
            if (n%i == 0){
                bool = false;
                break;
            }
            else{
                bool = true;
            }
        }
        return bool;
    }
}