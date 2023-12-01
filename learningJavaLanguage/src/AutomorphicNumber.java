import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int square = num*num;
        int lastDigNum = num%10;
        int lastDigSquare = square%10;

        if (lastDigNum == lastDigSquare){
            System.out.println(num + " is an Automorphic Number");
        }
        else {
            System.out.println(num + " is not an Automorphic Number");
        }
    }
}