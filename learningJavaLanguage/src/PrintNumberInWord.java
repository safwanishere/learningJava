import java.util.Scanner;

public class PrintNumberInWord{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = scan.nextInt();

        // switch (input){
        //     case 1:
        //         System.out.println("ONE");
        //         break;
        //     case 2:
        //         System.out.println("TWO");
        //         break;
        //     case 3:
        //         System.out.println("THREE");
        //         break;
        //     case 4:
        //         System.out.println("FOUR");
        //         break;
        //     case 5:
        //         System.out.println("FIVE");
        //         break;
        //     default:
        //         System.out.println("OTHER");
        // }

        if (input == 1){System.out.println("ONE");}
        else if (input == 2){System.out.println("TWO");}
        else if (input == 3){System.out.println("THREE");}
        else if (input == 4){System.out.println("FOUR");}
        else {System.out.println("OTHER");}
    }
}