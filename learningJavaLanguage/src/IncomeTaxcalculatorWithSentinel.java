import java.util.Scanner;

public class IncomeTaxcalculatorWithSentinel {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Enter the taxable income (or -1 to end) : $");
            int income = scan.nextInt();

            if (income == -1){
                System.out.println("bye!");
                break;
            }
            else {
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
                System.out.println();
            }
        }
        scan.close();
    }
}