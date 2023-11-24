import java.util.Scanner;

public class TimeTable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        scan.close();

        System.out.print("*\t|\t");
        for (int i = 1; i <= size; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 1; i <= size; i++){
            System.out.print("---------");
        }
        System.out.println();

        for (int row = 1; row <= size; row++){
            System.out.print(row + "\t|\t");
            for (int col = 1; col <= size; col++){
                System.out.print(col*row + "\t");
            }
            System.out.println();
        }
    }
}
