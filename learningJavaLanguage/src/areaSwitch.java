import java.util.Scanner;

public class areaSwitch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your choice : ");
        int input = scan.nextInt();

        System.out.println();

        switch (input){
            case 1: 
                System.out.println("area of a triangle : 1/2 * base * height");
                break;
            case 2:
                System.out.println("area of a circle : pi * r * r");
                break;
            case 3:
                System.out.println("area of a rectangle : length * breadth");
                break;
            case 4:
                System.out.println("area of a square : side * side");
                break;
        }

        System.out.println();

        scan.close();
    }
}
