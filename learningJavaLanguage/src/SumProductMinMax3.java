import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int numOne = scan.nextInt();
        System.out.print("Enter 2nd integer: ");
        int numTwo = scan.nextInt();
        System.out.print("Enter 3rd integer: ");
        int numThree = scan.nextInt();
        scan.close();

        int sum = numOne+numTwo+numThree;
        int product = numOne*numTwo*numThree;
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);

        int min, max;

        if (numOne>numTwo && numOne>numThree){
            max = numOne;
            if (numTwo < numThree){
                min = numTwo;
            } else {
                min = numThree;
            }
            System.out.println("The min is " + min);
            System.out.println("The max is " + max);
        }
        else if (numTwo>numOne && numTwo>numThree){
            max = numTwo;
            if (numOne < numThree){
                min = numOne;
            } else {
                min = numThree;
            }
            System.out.println("The min is " + min);
            System.out.println("The max is " + max);
        }
        else if (numThree>numOne && numThree>numTwo){
            max = numThree;
            if (numOne < numTwo){
                min = numOne;
            } else {
                min = numTwo;
            }
            System.out.println("The min is " + min);
            System.out.println("The max is " + max);
        }
    }
}
