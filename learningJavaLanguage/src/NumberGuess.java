import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int secretNumber = (int)(Math.random()*100);
        int count = 0;
        System.out.println("Key in your guess: ");

        while (true){
            int guess = scan.nextInt();
            count++;

            if (guess == secretNumber){
                System.out.print("you got it in " + count + " trials!");
                break;
            }
            else if (guess > secretNumber){
                System.out.println("Try lower");
            }
            else if (guess < secretNumber){
                System.out.println("Try higher");
            }
        }
    }
}