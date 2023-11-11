import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        int income = scan.nextInt();
        scan.close();

        double taxPayable;

        if (income <= 20000){
            taxPayable = income*0;
        }
        else if (income <= 40000){
            taxPayable = (double)(income-20000)*0.1;
        }
        else if (income <= 60000){
            taxPayable = (double)(20000)*0.1 + (double)(income-40000)*0.2;
        } else {
            taxPayable = (double)(20000)*0.1 + (double)(20000)*0.2 + (double)(income-60000)*0.3;
        }

        System.out.printf("The income tax payable is: $%.2f%n",taxPayable);
    }
}