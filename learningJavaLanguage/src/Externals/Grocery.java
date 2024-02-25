import java.util.Scanner;

// If a customer purchases more than 2 items, the cheapest item in their cart becomes free
// Take in size of cart, price of items and return the total cart price after applying the above offer
// example:
//     input:
//         4
//         20 130 40 60
//     output:
//         230

// explanation:
//     Since the cart has more than 2 items, the cheapest item i.e 20 rs will be free. So the sum is 130+40+60 = 230

public class Grocery{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        int min = 1000, sum = 0;
        
        for (int i = 0; i<size; i++){
            array[i] = scan.nextInt();
            
            if (array[i] < min){
                min = array[i];
            }

            sum += array[i];
        }

        if (array.length>2){
            System.out.println(sum-min);
        } else {
            System.out.println(sum);
        }
    }
}