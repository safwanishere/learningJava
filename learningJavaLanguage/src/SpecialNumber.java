import java.util.Scanner;

public class SpecialNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int dig, sumOfFactorialOfDig = 0;

        for (int i = num; i>0; i/=10){
            dig = i%10;
            sumOfFactorialOfDig += factorial(dig);
        }

        if (sumOfFactorialOfDig == num){
            System.out.println(num + " is a Special Number");
        } else {
            System.out.println(num + " is not a Special Number");
        }
    }

    public static int factorial(int n){
        int factorial = 1;

        for (int i = n; i>0; i--){
            factorial *= i;
        }

        return factorial;
    }
}