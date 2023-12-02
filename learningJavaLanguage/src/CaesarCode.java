import java.util.Scanner;

public class CaesarCode{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = scan.next().toUpperCase();
        scan.close();

        int stringLen = input.length();

        for (int charId = 0; charId>stringLen; charId++){
            char character = input.charAt(charId);
            System.out.print((char) (character + 3)); 
        }
    }
}