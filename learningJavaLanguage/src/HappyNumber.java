import java.util.Scanner;

public class HappyNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();

        int sumOfSquareOfDig = 0, dig, num = input;
        boolean check = false;

        while (true) {
            for (int i = num; i>0; i/=10){
                dig = i%10;
                sumOfSquareOfDig += dig*dig;
            }

            if (sumOfSquareOfDig<10){
                if (sumOfSquareOfDig == 1){
                    check = true;
                    break;
                } else {
                    check = false;
                    break;
                }
            }

            num = sumOfSquareOfDig;
            sumOfSquareOfDig = 0;
        }

        if (check){
            System.out.println(input + " is a Happy Number");
        } else {
            System.out.println(input + " is not a Happy Number");
        }
    }
}