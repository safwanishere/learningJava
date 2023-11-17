import java.util.Scanner;

public class NumberPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        scan.close();

        // A bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();

        // B bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (col>=row){
                    if (row>1){
                        System.out.print(col-row+1+" ");
                    } else {
                        System.out.print(col+" ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // C bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row + col >= size + 1){
                    System.out.print(col-size+row+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //D bit
        for (int row = 1; row <= size; row++){
            for (int col = size; col >= row; col--){
                System.out.print(col-row+1+" ");
            }
            System.out.println();
        }
    }
}
