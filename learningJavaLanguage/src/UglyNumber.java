import java.util.Scanner;

public class UglyNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();

        int num = input;
        boolean check = true;

        while (num != 1){
            if (num%5 == 0){
                num /= 5;
            }
            else if (num%3 == 0){
                num /= 3;
            }
            else if (num%2 == 0){
                num /= 2;
            }
            else {
                check = false;
                break;
            }
        }

        if (check){
            System.out.println(input + " is an Ugly Number");
        } else {
            System.out.println(input + " is not an Ugly Number");
        }
    }
}
