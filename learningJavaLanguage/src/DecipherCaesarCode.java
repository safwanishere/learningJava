import java.util.Scanner;

public class DecipherCaesarCode{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String input = scan.next().toUpperCase();
        scan.close();

        int stringLen = input.length();

        for (int charId = 0; charId<stringLen; charId++){
            char character = input.charAt(charId);
 
            if (character == 'A'){
                System.out.print('X');
            }
            else if (character == 'B'){
                System.out.print('Y');
            }
            else if (character == 'C'){
                System.out.print('Z');
            }
            else {
                System.out.print((char) (character - 3));
            }
        }
    }
}