import java.util.Scanner;

public class CircularPrime {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        scan.close();

        System.out.println(checkPrime(num));
    }

    public static boolean checkPrime(int num){
        boolean bool = false;
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                bool = false;
                break;
            }
            else{
                bool = true;
            }
        }
        return bool;
    }
}
