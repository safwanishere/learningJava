import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        for (int studentNo = 1; studentNo <= 3; studentNo++){
            while(true){
                System.out.print("Enter the mark (0-100) for student "+studentNo+": ");
                int studentMarks = scan.nextInt();

                if (studentMarks>=0 && studentMarks<=100){
                    sum += studentMarks;
                    break;
                }
                else {
                    System.out.println("Invalid input, try again...");
                    continue;
                }

            }
        }
        System.out.printf("The average is: %.2f%n",(double)(sum)/3);
    }
}