import java.util.Scanner;

public class CheckHexStr{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String input = scan.next();
        scan.close();

        int stringLen = input.length();
        boolean check = true;

        for (int charId = 0; charId < stringLen; charId++){
            char character = input.charAt(charId);

            if (!((character >= '0' && character <= '9')
            || (character >= 'A' && character <= 'F')
            || (character >= 'a' && character <= 'f'))){
                check = false;
                break;
            }
        }
        
        System.out.println(check ? (input + " is a hex string") : (input + " is not a hex string"));
    }
}