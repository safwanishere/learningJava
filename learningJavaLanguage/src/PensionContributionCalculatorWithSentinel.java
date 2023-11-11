import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Enter the monthly salary (or -1 to end): $");
            int salary = scan.nextInt();
    
            if (salary == -1){
                System.out.println("bye !");
                break;
            }
            else {
                System.out.print("Enter the age: ");
                byte age = scan.nextByte();
                System.out.print("The employee's contribution is: $");
                float employeeContr = scan.nextFloat();
                System.out.print("The employer's contribution is: $");
                float employerContr = scan.nextFloat();
                
                System.out.printf("The total contribution is: $%.2f%n",(float)(employeeContr+employerContr));
                System.out.println();
            }
        }
    }
}
