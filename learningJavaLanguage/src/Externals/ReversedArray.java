import java.util.Scanner;

public class ReversedArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i<size; i++){
            array[i] = scan.nextInt();
        }

        int[] reverseArray = new int[size];

        for (int i = 0; i<size; i++){
            reverseArray[i] = array[size-i-1];
        }

        for (int i = 0; i<size; i++){
            System.out.print(reverseArray[i] + " ");
        }
    }
}