import java.util.Scanner;

// find the smallest number in an array, given inputs are size of array and array elements

// input:
//     6
//     3 45 67 2 98 7
// output:
//     2

public class SmallerNeighbor{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        int min = 9999;

        for (int i = 0; i<size; i++){
            array[i] = scan.nextInt();

            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println(min);
    }
}

