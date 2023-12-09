import java.util.Scanner;

public class PrintArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = scan.nextInt();

        int[] items = new int[size];
        
        System.out.print("Enter the value of all items (seperated by space): ");
        for (int i = 0; i<size; i++){
            items[i] = scan.nextInt();
        }

        System.out.print("The values are: [ ");
        for (int i = 0; i<items.length; i++){
            System.out.print(items[i] + " ");
        }
        System.out.print("]");
    }
}