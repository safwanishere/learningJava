import java.util.Scanner;

public class ReverseString{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.next();
        scan.close();

        int stringLen = input.length();
        String reverse = "";

        for (int charId = stringLen-1; charId>=0; charId--){
            reverse += input.charAt(charId);
        }

        System.out.println("The reverse of the String \"" + input + "\" is \"" + reverse + "\"");
    }
}