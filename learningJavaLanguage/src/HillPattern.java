import java.util.Scanner;

public class HillPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int size = scan.nextInt();
        scan.close();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= (size*2); col++){
                if ((row + col >= size+1) && (row>=col-size+1)){
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
            for (int col = 1; col <= (size*2); col++){
                if (col>=row && col<=((size*2)-row)){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // C Bit
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= (size*2); col++){
                if ((row + col >= size+1) && (row>=col-size+1)){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++){
            for (int col = 1; col <= (size*2); col++){
                if (col>=row && col<=((size*2)-row)){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // D Bit
        for (int row = 0; row <= size; row++){
            System.out.print("# ");
            for (int col = 1; col <= (size*2); col++){
                if ((row + col >= size+1) && (row>=col-size+1)){
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size+1; row++){
            System.out.print("# ");
            for (int col = 1; col <= (size*2); col++){
                if (col>=row && col<=((size*2)-row)){
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        

    }
}