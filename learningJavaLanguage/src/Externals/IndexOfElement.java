import java.util.Scanner;

// Take in inputs as size of array, elements of array and a target element.
// Check if the target element is present in the array. If it is present, return its index otherwise return -1
// Example:
//  input:
//      5
//      1 2 6 0 -2
//      6
//   output:
//      2

public class IndexOfElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        int position = 0;

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i=0;i<size;i++){
            if (num[i] == target){
                position = i;
                break;
            } else {
                position = -1;
            }
        }

        System.out.println(position);
    }
}