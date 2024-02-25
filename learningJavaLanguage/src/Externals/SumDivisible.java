import java.util.Scanner;

// Take in 3 input integers; L value, R value and divisor. Check if the numbers between L and R are divisible by the divisor
// and return the count of number between L and R that are divisible by the given divisor.

// example:
//     input:
//         4
//         10
//         2
//     output:
//         4

public class SumDivisible{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int divisor = scan.nextInt();

        int count = 0;

        for (int i = L; i<=R; i++){
            if (i%divisor == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}