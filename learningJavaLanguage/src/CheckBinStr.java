import java.util.Scanner;

public class CheckBinStr{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = scan.next();
        scan.close();

        int stringLen = input.length();
        boolean check = true;

        for (int charId = 0; charId < stringLen; charId++){
            char character = input.charAt(charId);

            if (character != '0' && character != '1'){
                check = false;
                break;
            }
        }
        
        System.out.println(check ? (input + " is a binary string") : (input + " is not a binary string"));
    }
}