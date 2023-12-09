import java.util.Scanner;

public class Hex2Bin{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String input = scan.next();
        scan.close();

        String hex = input.toUpperCase();

        final String[] HexBits = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                                   "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        int strLen = input.length();

        System.out.print("The equivalent binary for hexadecimal \"" + input + "\" is: ");

        for (int charId = 0; charId < strLen; charId++){
            char character = hex.charAt(charId);
            if (character >= '0' && character <= '9'){
                System.out.print(HexBits[character-48] + " ");
            }
            else if (character >= 'A' && character <= 'F'){
                System.out.print(HexBits[character-55] + " ");
            }
        }
    }
}