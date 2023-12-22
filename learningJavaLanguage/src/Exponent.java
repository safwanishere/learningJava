import java.util.Scanner;

public class Exponent{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exp: ");
        int exp = scan.nextInt();
        scan.close();

        int answer = exponent(base, exp);

        System.out.print(base + " raises to the power of " + exp + " is: " + answer);
    }

    public static int exponent(int base, int exp){
        int product = 1;

        for (int i = 1; i<= exp; i++){
            product *= base;
        }

        return product;
    }
}