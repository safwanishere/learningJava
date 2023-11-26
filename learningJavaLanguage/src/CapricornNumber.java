import java.util.Scanner;

public class CapricornNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int squareOfNum = num*num, count = 0, addition;
        boolean check = true;

        for (int i = squareOfNum; i>0; i/=10){
            count += 1;
        }
        System.out.println(count);
        for (int i = 1; i<count; i++){
            addition = squareOfNum%(10^i) + squareOfNum%(10^(count-i));
            System.out.println(addition);
            if (addition == num){
                System.out.println(num + " is a Capricorn/Kaprekar number");
            }
            else {
                check = false;
            }
        }

        if (!check){
            System.out.println(num + " is not a Capricorn/Kaprekar number");
        }
    }
}
