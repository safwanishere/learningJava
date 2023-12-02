import java.util.Scanner;

public class TestPalindromicWord{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.next();
        scan.close();

        int stringLen = input.length(), fIndex = 0, bIndex = stringLen - 1;
        boolean check =  true;

        while(fIndex < bIndex){
            if (input.charAt(fIndex) == input.charAt(bIndex)){
                check = true;
            } else {
                check = false;
                break;
            }

            fIndex++;
            bIndex--;
        }

        if (check){
            System.out.println(input + " is a palindromic word");
        } else {
            System.out.println(input + " is not a palindromic word");
        }
    }
}