import java.util.Scanner;

public class GradesHistogram{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scan.nextInt();

        int[] marks = new int[size];
        int zero=0, ten=0, twenty=0, thirty=0, forty=0, fifty=0, sixty=0, seventy=0, eighty=0, ninety=0;

        for (int i = 0; i<size; i++){
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            int grade = scan.nextInt();
            marks[i] = grade;

            if (grade>=0 && grade<=9){
                zero += 1;
            }
            else if (grade>=10 && grade<=19){
                ten += 1;
            }
            else if (grade>=20 && grade<=29){
                twenty += 1;
            }
            else if (grade>=30 && grade<39){
                thirty += 1;
            }
            else if (grade>=40 && grade<=49){
                forty += 1;
            }
            else if (grade>=50 && grade<=59){
                fifty += 1;
            }
            else if (grade>=60 && grade<=69){
                sixty += 1;
            }
            else if (grade>=70 && grade<=79){
                seventy += 1;
            }
            else if (grade>=80 && grade<=89){
                eighty += 1;
            }
            else if (grade>=90 && grade<=100){
                ninety += 1;
            }
        }

        System.out.print(" 0 -  9: ");
        for(int i=1; i<=zero; i++){System.out.print("*");}
        System.out.println();
        System.out.print("10 - 19: ");
        for(int i=1; i<=ten; i++){System.out.print("*");}
        System.out.println();
        System.out.print("20 - 29: ");
        for(int i=1; i<=twenty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("30 - 39: ");
        for(int i=1; i<=thirty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("40 - 49: ");
        for(int i=1; i<=forty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("50 - 59: ");
        for(int i=1; i<=fifty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("60 - 69: ");
        for(int i=1; i<=sixty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("70 - 79: ");
        for(int i=1; i<=seventy; i++){System.out.print("*");}
        System.out.println();
        System.out.print("80 - 89: ");
        for(int i=1; i<=eighty; i++){System.out.print("*");}
        System.out.println();
        System.out.print("90 - 100: ");
        for(int i=1; i<=ninety; i++){System.out.print("*");}
        System.out.println();
    }
}