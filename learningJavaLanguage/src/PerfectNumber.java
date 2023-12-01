import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int sumOfDivisors = 0;

        for (int i = 1; i<=num/2; i++){
            if (num%i == 0){
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == num){
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}