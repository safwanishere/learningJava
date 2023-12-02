import java.util.Scanner;

public class ExchangeCipher{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = scan.next().toUpperCase();
        scan.close();

        int stringLen = input.length();

        for (int charID = 0; charID<stringLen; charID++){
            int character = input.charAt(charID);

            System.out.print((char) (155 - character));
        }
    }
}