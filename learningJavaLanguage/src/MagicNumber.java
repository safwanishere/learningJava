import java.util.Scanner;

public class MagicNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int inp = input;

        int sum = 0, rem, rev = 0;

        for (int i = 0; input>0; i++){
            rem = input%10;
            sum += rem;

            input /= 10;
        }

        System.out.println(sum);
        
        for (int i = 0; sum>0; i++){
            rem = sum%10;
            rev = rev * 10 + rem;

            sum /= 10;
        }

        System.out.println(rev);
        System.out.println();

        if (sum*rev == input){
            System.out.println(inp + " is a magic number");
        } else {
            System.out.println(inp + " is not a magic number");
        }
        
    }
}
