import java.util.Scanner;

public class TimeTable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        scan.close();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                System.out.print(col*row + "\t");
            }
            System.out.println();
        }
    }
}
