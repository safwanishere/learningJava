import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        double priceTotal=0, actualPriceTotal=0, salesTaxTotal=0, actualPrice, salesTax;

        while(true){
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            double taxIncPrice = scan.nextDouble();

            if (taxIncPrice == -1.0){
                System.out.println("Total Price is: $"+priceTotal);
                System.out.println("Total Actual Price is: $"+actualPriceTotal);
                System.out.println("Total Sales Tax is: $"+salesTaxTotal);
                break;
            }
            else {
                actualPrice = taxIncPrice - (taxIncPrice%100);
                salesTax = taxIncPrice - actualPrice;
                System.out.println("Actual Price is: $"+actualPrice+", Sales Tax is: $"+salesTax);                
                System.out.println();

                priceTotal += taxIncPrice;
                actualPriceTotal += actualPrice;
                salesTaxTotal += salesTax;
            }
        }
    }    
}
