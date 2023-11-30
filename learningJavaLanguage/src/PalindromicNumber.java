import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int dig, rev = 0;

        for (int i = num; i>0; i/=10){
            dig = i%10;
            rev = rev*10 + dig;
        }

        if (num == rev){
            System.out.println(num + " is a Palindromic Number");
        } else {
            System.out.println(num + " is not a Palindromic Number");
        }
    }
}
