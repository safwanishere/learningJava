import java.util.Scanner;

public class PrintConsonants{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int stringLen = input.length();
        String output = "";

        for (int charId = 0; charId<stringLen; charId++){
            char character = input.charAt(charId);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                continue;
            } else{
                output += character;
            }
        }

        System.out.println(output);
    }
}