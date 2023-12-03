import java.util.Scanner;

public class TestPalindromicPhrase{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String intake = scan.nextLine();
        scan.close();

        String input = intake.toUpperCase();
        String filteredInput = "";
        int ogStringLen = input.length();

        for (int charId = 0; charId < ogStringLen; charId++){
            char character = input.charAt(charId);

            if (character >= 'A' && character <= 'Z'){
                filteredInput += character;
            }
        }

        int stringLen = filteredInput.length(), fIndex = 0, bIndex = stringLen - 1;
        boolean check =  true;

        while(fIndex < bIndex){
            if (filteredInput.charAt(fIndex) == filteredInput.charAt(bIndex)){
                check = true;
            } else {
                check = false;
                break;
            }

            fIndex++;
            bIndex--;
        }

        if (check){
            System.out.println("\"" + intake + "\"" + " is a palindromic phrase");
        } else {
            System.out.println("\"" + intake + "\"" + " is not a palindromic phrase");
        }
    }
}