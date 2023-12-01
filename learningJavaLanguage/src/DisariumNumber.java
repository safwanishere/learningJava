import java.util.Scanner;
import java.lang.Math;

public class DisariumNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();

        int num = input, count = 0, dig, sumOfPowers = 0;

        for (int i = num; i>0; i/=10){ count++; }
        for (int i = count; i>0; i--){
            dig = num%10;
            sumOfPowers += Math.pow(dig, i);
            num /= 10;
        }
        
        if (sumOfPowers == input){
            System.out.println(input + " is a Disarium Number");
        } else {
            System.out.println(input + " is not a Disarium Number");
        }
    }
}