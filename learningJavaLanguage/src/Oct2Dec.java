import java.util.Scanner;

public class Oct2Dec{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String input = scan.next();
        scan.close();

        int decimal = Integer.parseInt(input, 8);

        System.out.println("The equivalent decimal number for octal \"" + input + "\" is: " + decimal);
    }
}