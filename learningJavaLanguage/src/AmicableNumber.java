import java.util.Scanner;

public class AmicableNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();

        int SOD_num1 = 0, SOD_num2 = 0;

        for (int i = 1; i<num1 || i<num2; i++){
            if (i!=num1 && i!=num2){
                if (i<num1 && num1 % i == 0){
                    SOD_num1 += i;
                }
                if (i<num2 && num2 % i == 0){
                    SOD_num2 += i;
                }
            }
        }

        if (SOD_num1==num2 && SOD_num2==num1){
            System.out.println("The numbers are Amicable Numbers.");
        }
        else {
            System.out.println("The numbers are not Amicable Numbers.");
        }
    }
}