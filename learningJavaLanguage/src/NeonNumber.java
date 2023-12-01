import java.util.Scanner;

public class NeonNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int square = num*num, dig, sumOfDig = 0;

        for (int i = square; i>0; i/=10){
            dig = i%10;
            sumOfDig += dig;
        }
        if (sumOfDig == num){
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }
    }
}