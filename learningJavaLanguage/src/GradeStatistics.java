import java.util.Scanner;

public class GradeStatistics{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scan.nextInt();

        int[] marks = new int[size];
        int sum = 0, max = 0, min = 100;

        for (int i = 0; i<size; i++){
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            int grade = scan.nextInt();
            marks[i] = grade;

            sum += grade;
            if (grade > max){
                max = grade;
            }
            if (grade < min){
                min = grade;
            }
        }

        System.out.printf("The average is: %.2f", (double) sum/size);
        System.out.println("\nThe minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}