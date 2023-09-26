import java.util.*;

public class DayEight {
    public static void main(String args[]){
        sumOfDigits();
        sumInRange();
        zeroesInSum();
    }

    public static void sumOfDigits(){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your number: ");
        int number = scan.nextInt();
        int initNumber = number;
        int rem,sum = 0;

        while(number>0){
            rem = number % 10;
            number /= 10;
            sum += rem;
        }

        System.out.println("the sum of the digits of " + initNumber + " is " + sum);
    }

    public static void sumInRange(){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your number: ");
        int number = scan.nextInt();
        int initNumber = number;
        int rem,sum = 0;

        while(number>0){
            rem = number % 10;
            number /= 10;
            sum += rem;
        }

        if (sum>=100 && sum<=200){
            System.out.println("sum of " + initNumber + " : " + sum + " lies between 100 and 200");
        } else {
            System.out.println("sum of " + initNumber + " : " + sum + " does not lies between 100 and 200");
        }
    }

    public static void zeroesInSum(){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your number: ");
        int number = scan.nextInt();
        int rem,sum = 0;

        while(number>0){
            rem = number % 10;
            number /= 10;
            sum += rem;
        }

        sum *= 10;
        int initSum = sum;
        int zeroCount = 0;

        while (sum>0){
            rem = sum % 10;
            if (rem == 0){
                zeroCount += 1;
            }
            sum /= 10;
        }

        System.out.print("the sum multiplied by 10 : " + initSum + " has " + zeroCount + " zeroes");

        scan.close();
    }
}