import java.util.Scanner;

public class TriangularPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        scan.close();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++){
            for (int col = size; col >= row; col--){
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row>1 && col<row){
                    System.out.print("  ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row<size && col<=(size-row)){
                    System.out.print("  ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}