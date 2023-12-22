import java.util.Scanner;

public class OddEvenTest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();

        boolean bool = isOdd(input);

        if (bool){
            System.out.println(input + " is an odd number");
        } else {
            System.out.println(input + " is an even number");
        }
    }

    public static boolean isOdd(int num){
        if (num%2 == 0){
            return false;
        } else {
            return true;
        }
    }
}