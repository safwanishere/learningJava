import java.util.Scanner;

public class InputValidation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            int input = scan.nextInt();
            if ((input>=0 && input<=10) || (input>=90 && input<=100)){
                System.out.println("You have entered: "+input);
                break;
            }
            else{
                System.out.println("Invalid input, try again...");
            }
        }
        scan.close();
    }
}
