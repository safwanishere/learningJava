import java.util.*;
public class Daythree {
    public static void main(String args[]){
        // int a=6, b=4, c=2;
        // System.out.println(a&b&c);
        // System.out.println(c&a);
        // System.out.println(a&b);

        // System.out.println(b|a&c);
        // System.out.println(c|a|b);

        // System.out.println(a^c&b|c);
        // System.out.println(c^c*(a|c));
        // System.out.println(b+c^(a&b));  
        // System.out.println(a+b-c*(a*b*c));

        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // int c = scan.nextInt();
        // if (a>b && a>c){
        //     System.out.println(a + " A is greater than B and C");
        // }
        // else if (b>c && b>a){
        //     System.out.println(b + " B is greater than A and C");
        // }
        // else if (c>a && c>b){
        //     System.out.println(c + " C is greater than A and B");
        // }
        
        // Scanner scan = new Scanner(System.in);
        // System.out.print("enter your number: ");
        // int num = scan.nextInt();
        // if (num > 0){
        //     System.out.println(num + " is a positive number");
        // }
        // else if (num < 0){
        //     System.out.println(num + " is a negative number");
        // }
        // else{
        //     System.out.println("given number is zero");
        // }

        Scanner scan = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = scan.nextInt();
        if (num%2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
        
    }
}
