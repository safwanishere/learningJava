import java.util.Scanner;

public class CountVowelsDigits{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.next();
        scan.close();

        int stringLen = input.length();
        int vowelCount = 0, digitCount = 0, count = 0;

        for (int charId = 0; charId<stringLen; charId++){
            count++;
            char character = input.charAt(charId);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowelCount ++;
            } else if (character == '0' || character == '1' || character == '2' || character == '3' || character == '4' || character == '5' || character == '6' || character == '7' || character == '8' || character == '9'){
                digitCount++;
            }
        }

        System.out.print("Number of vowels: "+ vowelCount);
        System.out.printf(" (%.2f%%)", (double) (vowelCount*100)/count);
        System.out.println();
        System.out.print("Number of digits: "+ digitCount);
        System.out.printf(" (%.2f%%)", (double) (digitCount*100)/count);
    }
}