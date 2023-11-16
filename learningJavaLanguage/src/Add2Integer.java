import java.util.Scanner;

public class Add2Integer {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first intger: ");
        int numOne = scan.nextInt();
        System.out.print("Enter second intger: ");
        int numTwo = scan.nextInt();
        scan.close();

        int sum = numOne + numTwo;

        System.out.println("The sum is: "+ sum);
    }
}