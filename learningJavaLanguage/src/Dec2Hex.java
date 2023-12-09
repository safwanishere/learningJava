import java.util.Scanner;

public class Dec2Hex{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = scan.nextInt();
        scan.close();

        if (dec < 0 ){
            System.out.println("please enter a positive number");
        } else {
            System.out.println("The equivalent hexadecimal number is " + Integer.toHexString(dec).toUpperCase());
        }
    }
}