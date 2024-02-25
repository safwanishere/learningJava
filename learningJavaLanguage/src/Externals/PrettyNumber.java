import java.util.Scanner;

// if a number ends with 2 or 3 or 9, it is a pretty number.
// In the left limit and right limit given, find the number of pretty numbers

public class PrettyNumber{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        
        int count = 0;

        for (int i = L; i<=R; i++){
            if (i%10 == 2 || i%10 == 3 || i%10 == 9){
                count++;
            }
        }

        System.out.println(count);
    }
}