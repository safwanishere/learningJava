import java.util.Scanner;

public class DecToBin{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int dec = scan.nextInt();

        String bin = Integer.toBinaryString(dec);

        System.out.println(bin);
    }
}