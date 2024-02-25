import java.util.Scanner;

public class CheckFour{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int check = scan.nextInt();

        int dig, count = 0;

        for (int i = input; i>0; i/=10){
            dig = i%10;

            if (dig == check){
                count++;
            }
        }

        System.out.println(count);
    }
}