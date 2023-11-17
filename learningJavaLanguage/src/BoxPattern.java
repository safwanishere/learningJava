import java.util.Scanner;

public class BoxPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        scan.close();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col ++){
                if (col==1 || col==size || row==1 || row==size){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // B bit 
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row==1 || row==size || row==col){
                    System.out.print("# ");
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
                if (row==1 || row==size || row+col==9){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // D bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row==1 || row==size || row==col || row+col==9){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // E bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row==1 || row==size || col==1 || col==size || row==col || row+col==9){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();        

    }
}