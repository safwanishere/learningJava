import java.util.Scanner;

public class Sugarcane{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();

        System.out.println("sugarcane : " + salary*0.2);
        System.out.println("salt & mint : " + salary*0.2);
        System.out.println("rent : " + salary*0.3);
    }
}