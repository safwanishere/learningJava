import java.util.Scanner;

// Find all the odd factors of a given number

// input:
//     18
// output:
//     1 3 9
// explanation:
//     factors of 18 are 1, 2, 3, 6, 9, 18

public class OddFactors{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for (int i = 1; i<=input; i++){
            if (input%i == 0 && i%2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}

