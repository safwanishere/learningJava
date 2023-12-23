import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class GradesStatisticsArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scan.nextInt();
        int[] grades = new int[size];
        readGrades(grades);

        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f \n", average(grades));
        System.out.printf("The median is: %.2f", median(grades));
        System.out.println("\nThe minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }

    public static void readGrades(int[] array){
        Scanner scan = new Scanner(System.in);
        int size = array.length;
        for (int i = 0; i<size; i++){
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            int grade = scan.nextInt();
            array[i] = grade;
        }
    }

    public static void print(int[] array){
        int len = array.length;

        System.out.print("The grades are: [");
        for (int i = 0; i<len; i++){
            if (i==len-1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]+ ", ");
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array){
        double sum = 0, size = array.length;
        for (int i = 0; i<size; i++){
            sum += array[i];
        }
        return (double) sum/size;
    }

    public static double median(int[] array){
        int size = array.length;
        Arrays.sort(array);

        double median = 0;

        if (size%2 == 0){
            median = (array[(size/2)-1] + array[size/2])/2;
            return median;
        }
        else if (size%2 != 0){
            median = array[size/2];
            return median;
        }
        return median;
    }

    public static int max(int[] array){
        int max = array[0];
        int size = array.length;

        for (int i = 0; i<size; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        int size = array.length;

        for (int i = 0; i<size; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static double stdDev(int[] array){
        int size = array.length;
        double mean = average(array);
        int sum = 0;
        for (int i = 0; i<size; i++){
            sum += (array[i]*array[i]) - (mean*mean); 
        }
        double stdDev = (double) Math.sqrt((sum/size));

        return stdDev;
    }
}