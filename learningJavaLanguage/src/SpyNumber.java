import java.util.Scanner;

public class SpyNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int sumOfDigs = 0, productOfDigs = 1, dig;

        for (int i = num; i>0; i/=10){
            dig = i%10;
            sumOfDigs += dig;
            productOfDigs *= dig;
        }
        
        if (sumOfDigs == productOfDigs){
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is a not a Spy Number");
        }
    }
}