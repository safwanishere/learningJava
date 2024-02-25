import java.util.Scanner;

// Find the factorial of given number but only multiply the odd numbers in the formula
// example:
//     input:
//         3
//     output:
//         3

// explanation:
//     factorial of 3, 3! = 3 * 2
//     since 2 is even, we remove it 
//     therefore output is 3

public class OddFactorial{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int oddFactorial = 1;

        for (int i = input; i>0; i--){
            if (i%2 == 1){
                oddFactorial *= i;
            }
        }

        System.out.println(oddFactorial);
    }
}

