import java.util.Scanner;

public class PrintArrayInStars{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = scan.nextInt();

        int[] items = new int[size];
        
        System.out.print("Enter the value of all items (seperated by space): ");
        for (int i = 0; i<size; i++){
            items[i] = scan.nextInt();
        }

        for (int i = 0; i<items.length; i++){
            System.out.print(i + ": ");
            for (int j = 1; j<=items[i]; j++){
                System.out.print("*");
            }
            System.out.print(" (" + items[i] + ")\n");
        }
    }
}