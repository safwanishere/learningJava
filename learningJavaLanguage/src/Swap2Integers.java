import java.util.Scanner;

public class Swap2Integers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int numOne = scan.nextInt();
        System.out.print("Enter second integer: ");
        int numTwo = scan.nextInt();

        int temp;
        temp = numOne;
        numOne = numTwo;
        numTwo = temp;

        System.out.println("After the swap, fisrt integer is: "+numOne+", second integer is: "+ numTwo);
    }
}