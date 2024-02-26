import java.util.Scanner;

public class BearCandies {
    // two sets increase such that both start at zero and A increaes in odd numbers like 1,3,5 so on. B increases in even numbers
    //the program takes 2 inputs as the upper limits of each set and gives out an output on which set will cross that upper limit(lose) first
    //input 3 2    output: for the given input B will win (since A starts at zero and increases to 1 and then B increases to 2, but then a needs
    //                     to increase by 3( 1+3) which it cannot sice its upper limit is only 3
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int upperLimitA = scan.nextInt();
        int upperLimitB = scan.nextInt();

        int countA = 0, countB = 0;

        for (int i = 1; i<=upperLimitA; i+=2){
            countA++;
        }

        for (int i = 2; i<=upperLimitB; i+=2){
            countB++;
        }

        if (countA > countB){
            System.out.println("B wins");
        } else {
            System.out.println("A wins");
        }
    }
}
