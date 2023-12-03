import java.util.Scanner;

public class Bin2Dec{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String input = scan.next();
        scan.close();

        int decimal = Integer.parseInt(input, 2);

        System.out.println("The equivalent decimal number for binary \"" + input + "\" is: " + decimal);
    }
}