import java.util.Scanner;

public class MagicSum{
    public static void main(String args[]){
        int sum = 0;

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a positive integer (or -1 to end): ");
            int num = scan.nextInt();

            if (num == -1){
                System.out.println("The magic sum is: " + sum);
                break;
            } else {
                if (hasEight(num)){
                    sum += num;
                }
            }
        }
    }

    public static boolean hasEight(int number){
        for (int i = number; i>0; i/=10){
            int dig = i%10;
            if (dig == 8){
                return true;
            }
        }
        return false;
    }
}