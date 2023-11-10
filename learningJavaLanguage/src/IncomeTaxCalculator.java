import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the taxable income: ");
        int income = scan.nextInt();
        scan.close();

        double taxPayable;

        if (income <= 20000){
            taxPayable = income*0;
        }
        else if (income <= 40000){
            taxPayable = income*0.1;
        }
        else if (income <= 60000){
            taxPayable = (income-40000)*0.2;
        }
    }
}
