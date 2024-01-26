import java.util.Scanner;

public class CheckPassFail{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Enter your marks: ");
            int mark = scan.nextInt();

            if (mark >= 50){
                System.out.println("PASS");
            }
            else if (mark == -1){
                System.out.println("DONE");
                break;
            }
            else {
                System.out.println("FAIL");
            }
        }
    }
}